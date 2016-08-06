package shakespartner.plays.othello

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene1 extends Scene {
   String getLocation() {
      "Before the castle."
   }

   int getScene() {
      1
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter CASSIO and some Musicians"], [speaker:"cassio", text:"Masters, play here I will content your pains Something thats brief and bid Good morrow, general."], [text:"Music"], [text:"Enter Clown"], [speaker:"clown", text:"Why masters, have your instruments been in Naples, that they speak i the nose thus"], [speaker:"first musician", text:"How, sir, how!"], [speaker:"clown", text:"Are these, I pray you, windinstruments"], [speaker:"first musician", text:"Ay, marry, are they, sir."], [speaker:"clown", text:"O, thereby hangs a tail."], [speaker:"first musician", text:"Whereby hangs a tale, sir"], [speaker:"clown", text:"Marry. sir, by many a windinstrument that I know. But, masters, heres money for you: and the general so likes your music, that he desires you, for loves sake, to make no more noise with it."], [speaker:"first musician", text:"Well, sir, we will not."], [speaker:"clown", text:"If you have any music that may not be heard, tot again: but, as they say to hear music the general does not greatly care."], [speaker:"first musician", text:"We have none such, sir."], [speaker:"clown", text:"Then put up your pipes in your bag, for Ill away: go vanish into air away!"], [text:"Exeunt Musicians"], [speaker:"cassio", text:"Dost thou hear, my honest friend"], [speaker:"clown", text:"No, I hear not your honest friend I hear you."], [speaker:"cassio", text:"Prithee, keep up thy quillets. Theres a poor piece of gold for thee: if the gentlewoman that attends the generals wife be stirring, tell her theres one Cassio entreats her a little favour of speech: wilt thou do this"], [speaker:"clown", text:"She is stirring, sir: if she will stir hither, I shall seem to notify unto her."], [speaker:"cassio", text:"Do, good my friend. In happy time, Iago."], [text:"Exit Clown"], [text:"Enter IAGO"], [speaker:"iago", text:"You have not been abed, then"], [speaker:"cassio", text:"Why, no the day had broke Before we parted. I have made bold, Iago, To send in to your wife: my suit to her Is, that she will to virtuous Desdemona Procure me some access."], [speaker:"iago", text:"Ill send her to you presently And Ill devise a mean to draw the Moor Out of the way, that your converse and business May be more free."], [speaker:"cassio", text:"I humbly thank you fort. I never knew A Florentine more kind and honest."], [text:"Exit IAGO"], [text:"Enter EMILIA"], [speaker:"emilia", text:"Good morrow, good Lieutenant: I am sorry For your displeasure but all will sure be well. The general and his wife are talking of it And she speaks for you stoutly: the Moor replies, That he you hurt is of great fame in Cyprus, And great affinity, and that in wholesome wisdom He might not but refuse you but he protests he loves you And needs no other suitor but his likings To take the safest occasion by the front To bring you in again."], [speaker:"cassio", text:"Yet, I beseech you, If you think fit, or that it may be done, Give me advantage of some brief discourse With Desdemona alone."], [speaker:"emilia", text:"Pray you, come in I will bestow you where you shall have time To speak your bosom freely."], [speaker:"cassio", text:"I am much bound to you."], [text:"Exeunt"]]
   }

}