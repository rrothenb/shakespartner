package shakespartner.plays.juliuscaesar

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene3 extends Scene {
   String getLocation() {
      "A street near the Capitol."
   }

   int getScene() {
      3
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter ARTEMIDORUS, reading a paper"], [speaker:"artemidorus", text:"Caesar, beware of Brutus take heed of Cassius come not near Casca have an eye to Cinna, trust not Trebonius: mark well Metellus Cimber: Decius Brutus loves thee not: thou hast wronged Caius Ligarius. There is but one mind in all these men, and it is bent against Caesar. If thou beest not immortal, look about you: security gives way to conspiracy. The mighty gods defend thee! Thy lover, ARTEMIDORUS. Here will I stand till Caesar pass along, And as a suitor will I give him this. My heart laments that virtue cannot live Out of the teeth of emulation. If thou read this, O Caesar, thou mayst live If not, the Fates with traitors do contrive."], [text:"Exit"]]
   }

}
