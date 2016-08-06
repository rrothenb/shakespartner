package shakespartner.plays.henrythesixthpart3

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene3 extends Scene {
   String getLocation() {
      "Another part of the field."
   }

   int getScene() {
      3
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Flourish. Enter KING EDWARD IV in triumph with GLOUCESTER, CLARENCE, and the rest"], [speaker:"king edward the fourth", text:"Thus far our fortune keeps an upward course, And we are graced with wreaths of victory. But, in the midst of this brightshining day, I spy a black, suspicious, threatening cloud, That will encounter with our glorious sun, Ere he attain his easeful western bed: I mean, my lords, those powers that the queen Hath raised in Gallia have arrived our coast And, as we hear, march on to fight with us."], [speaker:"clarence", text:"A little gale will soon disperse that cloud And blow it to the source from whence it came: The very beams will dry those vapours up, For every cloud engenders not a storm."], [speaker:"gloucester", text:"The queen is valued thirty thousand strong, And Somerset, with Oxford fled to her: If she have time to breathe be well assured Her faction will be full as strong as ours."], [speaker:"king edward the fourth", text:"We are advertised by our loving friends That they do hold their course toward Tewksbury: We, having now the best at Barnet field, Will thither straight, for willingness rids way And, as we march, our strength will be augmented In every county as we go along. Strike up the drum cry Courage! and away."], [text:"Exeunt"]]
   }

}
