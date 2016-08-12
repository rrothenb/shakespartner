package shakespartner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.codec.language.DoubleMetaphone;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.OutputSpeech;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SsmlOutputSpeech;
import com.amazon.speech.ui.Reprompt;

public class ShakesPartnerSpeechlet implements Speechlet  {

    private static final Logger log = LoggerFactory.getLogger(ShakesPartnerSpeechlet.class);

    public void onSessionStarted(final SessionStartedRequest request, final Session session)
            throws SpeechletException {
        log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());
    }

    public SpeechletResponse onLaunch(final LaunchRequest request, final Session session)
            throws SpeechletException {
        log.info("onLaunch requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());

        return newAskResponse(
                "Which of Shakespeare's characters would you like to read for today?",
                "You need to pick a character who you'll be reading for.");
    }

    public SpeechletResponse onIntent(final IntentRequest request, final Session session)
            throws SpeechletException {
        log.info("onIntent requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());

        String character = (String)session.getAttribute("character");
        String playName = (String)session.getAttribute("play");
        String sceneName = (String)session.getAttribute("scene");
        Integer lineNumber = (Integer)session.getAttribute("lineNumber");

        ClassLoader classLoader = getClass().getClassLoader();

        Intent intent = request.getIntent();
        String intentName = (intent != null) ? intent.getName() : null;

        log.info(intentName);
        log.info(intent.getSlots().keySet().toString());
        log.info("character: " + character);
        log.info("playName: " + playName);
        log.info("sceneName: " + sceneName);
        log.info("lineNumber: " + lineNumber);

        if ("AMAZON.HelpIntent".equals(intentName)) {
            return newAskResponse(
                    "ShakesPartner allows you to practice any part from any Shakespeare play even when nobody else is" +
                            " around.  ShakesPartner will ask you for the character and scene you want to read and it" +
                            " will read for all the other parts.  It will also tell you when you've gotten a line " +
                            "wrong.  If you forget your line simply say \"line\" and ShakesPartner will remind you " +
                            "what your line is.  If you want to skip your line simply say \"continue\" and " +
                            "ShakesPartner will move on.",
                    "I don't recognize that.");
        }
        else if ("AMAZON.StopIntent".equals(intentName)) {
            PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
            outputSpeech.setText("Goodbye");

            return SpeechletResponse.newTellResponse(outputSpeech);
        }
        else if ("AMAZON.CancelIntent".equals(intentName)) {
            PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
            outputSpeech.setText("Goodbye");

            return SpeechletResponse.newTellResponse(outputSpeech);
        }
        // or if change character (also need to clear session of character and play and scene and adjust message)
        if (character == null) {
            character = getStringValue(request);
            log.info("character: " + character);
            if (character == null) {
                return newAskResponse(
                        "I don't recognize that.  You need to pick a character for whom you'll be reading.",
                        "I don't recognize that.  You need to pick a character for whom you'll be reading.");
            }
            try {
                log.info("about to getPlays for " + character);
                List<String> playNames = Characters.getPossiblePlayNames(character);
                log.info("plays: " + playNames);
                if (playNames == null) {
                    return newAskResponse(
                            character + " is not a character that I recognize.  The closest matches I have are " + Characters.getClosestCharacters(character) + ".  Please try saying your character again.",
                            "I don't recognize that.  You need to pick a character for whom you'll be reading.");
                }
                else if (playNames.size() > 1) {
                    log.info("num plays: " + playNames.size());
                    session.setAttribute("character", character);
                    return newAskResponse(
                            character + " is in multiple plays.  Which one do you want?",
                            "I don't recognize that.  You need to pick a play from which you'll be reading for " + character);
                }
                else {
                    playName = playNames.get(0);
                    log.info("playName: " + playName);
                    session.setAttribute("character", character);
                    session.setAttribute("play", playName);
                    if (character == playName) {
                        return newAskResponse(
                                character + " is " + getSuperlative() + " character.  Which act and scene?",
                                "I don't understand that.  You need to pick an act and a scene from " + playName + " which you'll be reading from.  ");
                    }
                    else {
                        return newAskResponse(
                                character + " from " + playName + " is " + getSuperlative() + " character.  Which act and scene?",
                                "I don't understand that.  You need to pick an act and a scene from " + playName + " which you'll be reading from.  ");
                    }
                }
            }
            catch (Exception e) {
                throw new SpeechletException(e);
            }
        }
        else if (playName == null) {
            // if got change character intent, clear the character from the session, process as character and apologize in the message
            playName = getStringValue(request);
            if (playName == null) {
                return newAskResponse(
                        "I don't recognize that.  You need to pick a play from which you'll be reading for " + character,
                        "I don't recognize that.  You need to pick a play from which you'll be reading for " + character);
            }
            if (Characters.isValid(character, playName)) {
                session.setAttribute("play", playName);
                return newAskResponse(
                        character + " from " + playName + " is a great character.  Which act and scene?",
                        "I don't understand that.  You need to pick an act and a scene from " + playName + " which you'll be reading from");
            }
            else {
                return newAskResponse(
                        character + " doesn't appear in " + playName + ".  Please pick an appropriate play.  You can choose from " + String.join(" or ", Characters.getPossiblePlayNames(character)),
                        "I don't recognize that.  You need to pick a play from which you'll be reading for " + character);
            }
        }
        else if (sceneName == null) {
            sceneName = getSceneValue(request);
            if (sceneName == null) {
                return newAskResponse(
                        "I don't recognize that.  You need to pick an act and a scene from " + playName,
                        "I don't recognize that.  You need to pick an act and a scene from " + playName);
            }
            try {
                    List<Map<String,String>> lines = Scenes.getLines(playName, sceneName);
                    List<String> startingText = new ArrayList<String>();
                    session.setAttribute("scene", sceneName);
                    if (collectLines(session, startingText)) {
                        session.removeAttribute("scene");
                        return newAskResponse(
                                "You need to pick an act and a scene from " + playName + " that " + character + " actually appears in.  The first scene " + character + " is in is " + getFirstSceneWithCharacter(character, playName),
                                "I don't recognize that.  You need to pick an act and a scene from " + playName);
                    } else {
                        String response =
                                playName + " by william shakespeare.  " + sceneName + ".  " + Scenes.getLocation(playName, sceneName);
                        if (!response.endsWith(".")) {
                            response += ".";
                        }
                        response += "  " + String.join("  ", startingText);
                        log.info(response);
                        log.info("length: " + response.length());
                        return newAskResponse(
                                response,
                                "You need to read your line.");
                    }
            }
            catch (Exception e) {
                throw new SpeechletException(e);
            }

        }
        List<Map<String,String>> lines = Scenes.getLines(playName, sceneName);
        log.info("lineNumber: " + lineNumber);
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(256);
        String yourLine = lines.get(lineNumber).get("text").replaceAll("\\[[^\\]]*\\]","").toString();
        log.info("Expected:" + yourLine);
        String yourLineDM = doubleMetaphone.encode(yourLine);
        log.info(yourLineDM);
        String words = getStringValue(request);
        if (intentName.equals("ContinueIntent")) {
            session.setAttribute("lineNumber", lineNumber+1);
            List<String> nextLines = new ArrayList<String>();
            if (collectLines(session, nextLines)) {
                PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
                outputSpeech.setText("You did it!  You finished the scene!  You did " + getSuperlative() + " job!");

                return SpeechletResponse.newTellResponse(outputSpeech);
            }
            else {
                log.info(nextLines.toString());
                return newAskResponse(
                        String.join("  ", nextLines),
                        "Say your line");
            }
        }
        else if (intentName.equals("ProvideLineIntent")) {
            return newAskResponse(
                    yourLine,
                    "Say your line");
        }
        else if (words != null) {
            log.info("Given: " + words);
            String wordsDM = doubleMetaphone.encode(words);
            log.info(wordsDM);
            int distance = StringUtils.getLevenshteinDistance(yourLineDM, wordsDM);
            log.info("Distance :" + distance);
            log.info("length: " + yourLineDM.length());
            int percentDistance = distance*100/yourLineDM.length();
            percentDistance = (int)(percentDistance/(1.0/yourLineDM.length()+1));
            if (percentDistance < 25) {
                session.setAttribute("lineNumber", lineNumber+1);
                List<String> nextLines = new ArrayList<String>();
                if (collectLines(session, nextLines)) {
                    PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
                    outputSpeech.setText("You did it!  You finished the scene!  You did " + getSuperlative() + " job!");
                    return SpeechletResponse.newTellResponse(outputSpeech);
                }
                else {
                    log.info(nextLines.toString());
                    return newAskResponse(
                            String.join("  ", nextLines),
                            "Say your line");
                }
            }
            else {
                if (percentDistance < 50) {
                    return newAskResponse(
                            "Close but not quite.  Try saying your line again",
                            "Say your line");
                }
                else if (percentDistance < 75) {
                    return newAskResponse(
                            "Nope.  You may want to study the text a little bit more",
                            "Say your line");
                }
                return newAskResponse(
                        "Not even close.  Go back and memorize your line correctly",
                        "Say your line");
            }
        }
        else {
            return newAskResponse(
                    "You've got to say something",
                    "Say your line");
        }
    }

    public boolean collectLines(Session session, List<String> collectedLines) {
        String character = (String)session.getAttribute("character");
        Integer lineNumber = (Integer)session.getAttribute("lineNumber");
        String playName = (String)session.getAttribute("play");
        String sceneName = (String)session.getAttribute("scene");
        int collectedLineSize = 0;
        boolean linesTruncated = false;
        if (lineNumber == null) {
            lineNumber = 0;
        }
        List<Map<String,String>> lines = Scenes.getLines(playName, sceneName);
        for (int i=lineNumber;i<lines.size();i++) {
            Map text = lines.get(i);
            if (text.get("speaker") != null && text.get("speaker").toString().equals(character)) {
                log.info("collectedLineSize: " + collectedLineSize);
                log.info("lineNumber: " + i);
                session.setAttribute("lineNumber", i);
                return false;
            }
            else {
                String line = text.get("text").toString().replaceAll(":", ". ");
                while (collectedLineSize + line.length() > 7900 && !collectedLines.isEmpty()) {
                    collectedLineSize -= collectedLines.remove(0).length();
                    linesTruncated = true;
                }
                collectedLines.add(line);
                collectedLineSize += line.length();
            }
        }
        if (linesTruncated) {
            collectedLines.add(0, "skipping ahead.");
        }
        return true;
    }

    public void onSessionEnded(final SessionEndedRequest request, final Session session)
            throws SpeechletException {
        log.info("onSessionEnded requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());
    }

    private SpeechletResponse newAskResponse(String stringOutput, boolean isOutputSsml,
                                             String repromptText, boolean isRepromptSsml) {
        OutputSpeech outputSpeech, repromptOutputSpeech;
        if (isOutputSsml) {
            outputSpeech = new SsmlOutputSpeech();
            ((SsmlOutputSpeech) outputSpeech).setSsml(stringOutput);
        } else {
            outputSpeech = new PlainTextOutputSpeech();
            ((PlainTextOutputSpeech) outputSpeech).setText(stringOutput);
        }

        if (isRepromptSsml) {
            repromptOutputSpeech = new SsmlOutputSpeech();
            ((SsmlOutputSpeech) repromptOutputSpeech).setSsml(repromptText);
        } else {
            repromptOutputSpeech = new PlainTextOutputSpeech();
            ((PlainTextOutputSpeech) repromptOutputSpeech).setText(repromptText);
        }
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);
        return SpeechletResponse.newAskResponse(outputSpeech, reprompt);
    }

    private SpeechletResponse newAskResponse(String stringOutput, String repromptText) {
        log.info("Response: " + stringOutput);
        SpeechletResponse response = newAskResponse(stringOutput, false, repromptText, false);
        return response;
    }

    private String getStringValue(IntentRequest request) {
        Intent intent = request.getIntent();
        String name = intent.getName();
        if (name.equals("PlayIntent")) {
            return intent.getSlot("Play").getValue().toLowerCase();
        }
        else if (name.equals("CharacterIntent")) {
            return intent.getSlot("Character").getValue().toLowerCase();
        }
        else if (name.equals("LineIntent")) {
            return intent.getSlot("Words").getValue().toLowerCase();
        }
        else {
            return null;
        }
    }

    private String getSceneValue(IntentRequest request) {
        Intent intent = request.getIntent();
        String name = intent.getName();
        if (name.equals("SceneIntent")) {
            try {
                int sceneNumber = Integer.decode(intent.getSlot("Scene").getValue());
                int actNumber = Integer.decode(intent.getSlot("Act").getValue());
                return "Act " + actNumber + ", scene " + sceneNumber;
            }
            catch (Exception e) {
                return null;
            }
        }
        else {
            return null;
        }
    }

    private String getFirstSceneWithCharacter(String character, String playName) {
        String firstScene = Scenes.getScenes(playName, character).get(0);
        return firstScene;
    }

    private String getSuperlative() {
        String[] superlatives = {
                "a great",
                "a terrific",
                "one awesome",
                "an outstanding",
                "a wonderful",
                "one hella tight",
                "a brilliant",
                "a fascinating",
                "an excellent",
                "a marvelous",
                "a superb",
                "an exceptional",
                "a splendid",
                "a stupendous",
                "an exquisite",
                "a spectacular",
                "a commendable",
                "a top notch",
                "a swell",
                "a dandy",
                "a nifty",
                "a fine",
                "a stellar",
                "a grand",
                "an exemplary",
                "a prime",
                "a first class",
                "a delightful",
                "a sublime",
                "an impressive",
                "a glorious",
                "a magnificent"};
        return superlatives[new Random().nextInt(superlatives.length)];

    }
}

/*

TODO list

Make all interfacing to the data through those three classes
Make reusable class for handling JSON.  have it cache files.
change groovy script to generate files - characters to plays, characters to scenes for each play, scenes
for each play create a directory using play name and in it put files for every scene and a file called characters
at top level have a file called characters

 */