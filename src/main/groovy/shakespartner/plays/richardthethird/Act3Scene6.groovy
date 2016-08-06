package shakespartner.plays.richardthethird

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene6 extends Scene {
   String getLocation() {
      "The same."
   }

   int getScene() {
      6
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter a Scrivener, with a paper in his hand"], [speaker:"scrivener", text:"This is the indictment of the good Lord Hastings Which in a set hand fairly is engrossd, That it may be this day read over in Pauls. And mark how well the sequel hangs together: Eleven hours I spent to write it over, For yesternight by Catesby was it brought me The precedent was full as long adoing: And yet within these five hours lived Lord Hastings, Untainted, unexamined, free, at liberty Heres a good world the while! Why whos so gross, That seeth not this palpable device Yet whos so blind, but says he sees it not Bad is the world and all will come to nought, When such bad dealings must be seen in thought."], [text:"Exit"]]
   }

}
