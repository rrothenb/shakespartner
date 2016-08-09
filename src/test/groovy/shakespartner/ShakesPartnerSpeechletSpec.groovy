import com.amazon.speech.slu.Intent
import com.amazon.speech.slu.Slot
import com.amazon.speech.speechlet.IntentRequest
import com.amazon.speech.speechlet.LaunchRequest
import com.amazon.speech.speechlet.Session
import com.amazon.speech.speechlet.SpeechletResponse
import groovy.transform.NotYetImplemented
import org.junit.Rule
import org.junit.rules.TestName
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import shakespartner.ShakesPartnerSpeechlet
import spock.lang.Specification

class ShakesPartnerSpeechletSpec extends Specification {
   @Rule
   TestName name = new TestName()
   static final Logger log = LoggerFactory.getLogger(ShakesPartnerSpeechletSpec);

   def speechlet = new ShakesPartnerSpeechlet()
   def session = Session.builder().withSessionId("sessionID").build()

   SpeechletResponse run(String intentName) {
      run(intentName, [:])
   }

   SpeechletResponse run(String intentName, Map slots) {
      def intentBuilder = Intent.builder().withName(intentName)
      Map<String, Slot> slotMap = [:]
      for (def slot : slots) {
         def slotBuilder = Slot.builder().withName(slot.key).withValue(slot.value)
         slotMap[slot.key] = slotBuilder.build()
      }
      intentBuilder.withSlots(slotMap)
      def intentRequest = IntentRequest.builder().withRequestId("requestID").withIntent(intentBuilder.build()).build()
      def response = speechlet.onIntent(intentRequest, session)
      log.info(intentName + ": " + response.outputSpeech.text)
      response
   }

   def setup() {
      def launchRequest = LaunchRequest.builder().withRequestId("requestID").build()
      speechlet.onLaunch(launchRequest, session)
      log.info("#" * (44 + name.methodName.length()))
      log.info("###################   " + name.methodName + "   ###################")
      log.info("#" * (44 + name.methodName.length()))
   }

   // tests

   def "A typical session works"() {
      when:
      def response1 = run("CharacterIntent", [Character: "bernardo"])
      def response2 = run("SceneIntent", [Act: "1", Scene: "1"])
      def response3 = run("LineIntent", [Words: "Who's there"])
      def response4 = run("ProvideLineIntent")
      def response5 = run("ContinueIntent")

      then:
      response1.outputSpeech.text ==~ /bernardo from hamlet is .* character.  Which act and scene\?/
      response2.outputSpeech.text == "hamlet by william shakespeare.  Act 1, scene 1.  Elsinore. A platform before " +
            "the castle.  FRANCISCO at his post. Enter to him BERNARDO"
      response3.outputSpeech.text == "Nay, answer me: stand, and unfold yourself."
      response4.outputSpeech.text == "Long live the king!"
      response5.outputSpeech.text == "Bernardo"
   }

   def "The sample scenario with doctor butts works as expected"() {
      when:
      def response1 = run("CharacterIntent", [Character: "doctor butts"])
      def response2 = run("SceneIntent", [Act: "5", Scene: "2"])
      def response3 = run("LineIntent", [Words: "This is a piece of malice. I am glad I came this way so happily: the king Shall " +
            "understand it presently."])
      def response4 = run("LineIntent", [Words: "Ill show your grace the strangest sight"])
      def response5 = run("LineIntent", [Words: "I think your highness saw this many a day."])
      def response6 = run("LineIntent", [Words: "There, my lord: The high promotion of his grace of Canterbury; Who holds his state at door, " +
            "'mongst pursuivants, Pages, and footboys."])

      then:
      response1.outputSpeech.text ==~ /doctor butts from henry the eighth is .* character.  Which act and scene\?/
      !response1.shouldEndSession
      response2.outputSpeech.text == "henry the eighth by william shakespeare.  Act 5, scene 2.  Before the councilchamber." +
            " Pursuivants, Pages,  and c.  Yes, my lord But yet I cannot help you.  Why  Enter DOCTOR BUTTS  Your " +
            "grace must wait till you be calld for.  So."
      !response2.shouldEndSession
      response3.outputSpeech.text == "Exit  [Aside]Tis Butts, The kings physician: as he passd along, How earnestly he cast his eyes upon me! Pray " +
            "heaven, he sound not my disgrace! For certain, This is of purpose laid by some that hate me God turn their hearts! I never sought " +
            "their malice To quench mine honour: they would shame to make me Wait else at door, a fellowcounsellor, Mong boys, grooms, and lackeys." +
            " But their pleasures Must be fulfilld, and I attend with patience.  Enter the KING HENRY VIII and DOCTOR BUTTS at a window above"
      !response3.shouldEndSession
      response4.outputSpeech.text == "Whats that, Butts"
      !response4.shouldEndSession
      response5.outputSpeech.text == "Body o me, where is it"
      !response5.shouldEndSession
      response6.outputSpeech.text ==~ /You did it!  You finished the scene!  .* job!/
      response6.shouldEndSession
   }

   def "A character can be in multiple plays"() {
      when:
      def response1 = run("CharacterIntent", [Character: "francisco"])
      def response2 = run("PlayIntent", [Play: "othello"])
      def response3 = run("PlayIntent", [Play: "hamlet"])

      then:
      response1.outputSpeech.text == "francisco is in multiple plays.  Which one do you want?"
      response2.outputSpeech.text == "francisco doesn't appear in othello.  Please pick an appropriate play.  You can choose from hamlet or the " +
            "tempest"
      response3.outputSpeech.text ==~ /francisco from hamlet is .* character.  Which act and scene\?/
   }

   def "If you get the scene wrong it will tell you the first scene"() {
      when:
      run("CharacterIntent", [Character: "hamlet"])
      def response2 = run("SceneIntent", [Act: "1", Scene: "1"])

      then:
      response2.outputSpeech.text == "You need to pick an act and a scene from hamlet that hamlet actually appears in.  The first scene hamlet is " +
            "in is act 1 scene 2"
   }

   def "If you get the line wrong it will tell you so"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])
      run("SceneIntent", [Act: "1", Scene: "1"])
      def response3 = run("LineIntent", [Words: "Yo. What up?"])

      then:
      response3.outputSpeech.text == "Nope.  You may want to study the text a little bit more"
   }

   def "If you get the line only slightly wrong it will accept it"() {
      when:
      run("CharacterIntent", [Character: "sicinius"])
      run("SceneIntent", [Act: "3", Scene: "1"])
      def response3 = run("LineIntent", [Words: "piss new father"])


      then:
      response3.outputSpeech.text == "Hath he not passd the noble and the common  Cominius, no.  Have I had childrens voices  Tribunes, give way he" +
            " shall to the marketplace.  The people are incensed against him."
   }

   def "Handle getting play when expecting a character"() {
      when:
      def response1 = run("PlayIntent", [Play: "much ado about nothing"])

      then:
      response1.outputSpeech.text == "much ado about nothing is not a character that I recognize.  The closest matches I have are captain, second " +
            "petitioner, and second attendant.  Please try saying your character again."
   }

   def "Handle getting scene when expecting a character"() {
      when:
      def response1 = run("SceneIntent", [Act: "1", Scene: "1"])

      then:
      response1.outputSpeech.text == "I don't recognize that.  You need to pick a character for whom you'll be reading."
   }

   def "Handle getting scene when expecting a play"() {
      when:
      run("CharacterIntent", [Character: "francisco"])
      def response2 = run("SceneIntent", [Act: "1", Scene: "1"])

      then:
      response2.outputSpeech.text == "I don't recognize that.  You need to pick a play from which you'll be reading for francisco"
   }

   def "Handle getting character when expecting a play"() {
      when:
      run("CharacterIntent", [Character: "francisco"])
      def response2 = run("CharacterIntent", [Character: "falstaff"])

      then:
      response2.outputSpeech.text == "francisco doesn't appear in falstaff.  Please pick an appropriate play.  You can choose from hamlet or the tempest"
   }

   def "Handle getting play when expecting a scene"() {
      when:
      run("CharacterIntent", [Character: "hamlet"])
      def response2 = run("PlayIntent", [Play: "the tempest"])

      then:
      response2.outputSpeech.text == "I don't recognize that.  You need to pick an act and a scene from hamlet"
   }

   def "Handle getting scene when expecting a line"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])
      run("SceneIntent", [Act: "1", Scene: "1"])
      def response3 = run("SceneIntent", [Act: "1", Scene: "1"])

      then:
      response3.outputSpeech.text == "You've got to say something"
   }

   def "Handle characters with a roman numeral"() {
      when:
      def response1 = run("CharacterIntent", [Character: "king henry the eighth"])

      then:
      response1.outputSpeech.text ==~ /king henry the eighth from henry the eighth is .* character.  Which act and scene\?/
   }

   def "Handle plays with a roman numeral"() {
      when:
      run("CharacterIntent", [Character: "gower"])
      def response2 = run("PlayIntent", [Play: "henry the fifth"])

      then:
      response2.outputSpeech.text ==~ /gower from henry the fifth is .* character.  Which act and scene\?/
   }

   @NotYetImplemented
   def "Change character"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])
      run("ChangeCharacterIntent", [Character: "francisco"])

      then:
      false
   }

   @NotYetImplemented
   def "Change play"() {
      when:
      run("CharacterIntent", [Character: "francisco"])
      run("PlayIntent", [Play: "hamlet"])
      run("ChangePlayIntent", [Play: "the tempest"])

      then:
      false
   }

   @NotYetImplemented
   def "Change scene"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   def "Handle stage directions in line"() {
      when:
      run("CharacterIntent", [Character: "hamlet"])
      run("SceneIntent", [Act: "3", Scene: "4"])
      def response3 = run("LineIntent", [Words: "mother mother mother"])

      then:
      response3.outputSpeech.text != "Go back and memorize your line correctly"
   }

   @NotYetImplemented
   def "handle multiple character name errors in a row"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   @NotYetImplemented
   def "handle multiple play name errors in a row"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   @NotYetImplemented
   def "handle multiple scene errors in a row"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   @NotYetImplemented
   def "handle multiple line errors in a row"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   @NotYetImplemented
   def "if the number of scenes is small, give the actual list of scenes if an invalid scene is provided"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   def "if the character only appears in one play and the name of the play == the character then don't announce the play"() {
      when:
      def response1 = run("CharacterIntent", [Character: "hamlet"])

      then:
      log.info(response1.outputSpeech.text)
      log.info("hamlet is .* character.  Which act and scene?")
      log.info "Result: " + (response1.outputSpeech.text ==~ /hamlet is .* character.  Which act and scene\?/)
      response1.outputSpeech.text ==~ /hamlet is .* character.  Which act and scene\?/
   }

   def "When a line doesn't pass the matching criteria, let the user know if it was close, medium or far"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])
      run("SceneIntent", [Act: "1", Scene: "1"])
      def response3 = run("LineIntent", [Words: "Looks like I got here just in time for some major party action"])
      def response4 = run("LineIntent", [Words: "Anybody there?  Guys?"])
      def response5 = run("LineIntent", [Words: "Who goes there"])

      then:
      response3.outputSpeech.text == "Not even close.  Go back and memorize your line correctly"
      response4.outputSpeech.text == "Nope.  You may want to study the text a little bit more"
      response5.outputSpeech.text == "Close but not quite.  Try saying your line again"
   }

   def "When a character isn't recognized, return the three closest characters"() {
      when:
      def response1 = run("CharacterIntent", [Character: "beer narco"])

      then:
      response1.outputSpeech.text == "beer narco is not a character that I recognize.  The closest matches I have are bernardo, porter, and horner." +
            "  Please try saying your character again."
   }

   @NotYetImplemented
   def "When prompted for a character, the user should be able to ask for the list of characters in a given play"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   @NotYetImplemented
   def "If the user asks for the list of characters in a given play, the play should be set to that in the next step if the character given is in multiple plays"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   def "Limit spoken lines by size"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }

   def "If limiting spoken lines, preface with an indication that lines are missing"() {
      when:
      run("CharacterIntent", [Character: "bernardo"])

      then:
      false
   }
}