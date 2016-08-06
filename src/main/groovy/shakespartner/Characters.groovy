package shakespartner

import groovy.transform.CompileStatic

@CompileStatic
class Characters {
   static List<Play> getPlays(String character) {
      characters[character].collect {playName -> Plays.getPlay(playName)}
   }

   static String getPossilblePlays(String character) {
      getPlays(character)*.name.join(" or ")
   }

   static boolean isValid(String character, String play) {
      getPlays(character)*.name.contains(play)
   }
   static Map<String,List<String>> characters = ["king henry the fourth":["henry the fourth"], "westmoreland":["henry the fifth", "henry the fourth", "henry the sixth part 3"], "falstaff":["henry the fourth", "merry wives of windsor"], "prince henry":["henry the fourth", "king john"], "poins":["henry the fourth"], "earl of worcester":["henry the fourth"], "northumberland":["henry the fourth", "henry the sixth part 3", "richard the second"], "hotspur":["henry the fourth"], "sir walter blunt":["henry the fourth"], "first carrier":["henry the fourth"], "ostler":["henry the fourth"], "second carrier":["henry the fourth"], "gadshill":["henry the fourth"], "chamberlain":["henry the eighth", "henry the fourth"], "bardolph":["henry the fifth", "henry the fourth", "merry wives of windsor"], "peto":["henry the fourth"], "first traveller":["henry the fourth"], "thieves":["henry the fourth"], "travellers":["henry the fourth"], "lady percy":["henry the fourth"], "servant":["a comedy of errors", "a winters tale", "alls well that ends well", "hamlet", "henry the eighth", "henry the fourth", "henry the sixth part 1", "henry the sixth part 2", "julius caesar", "macbeth", "measure for measure", "merchant of venice", "merry wives of windsor", "pericles", "richard the second", "romeo and juliet", "taming of the shrew", "timon of athens", "troilus and cressida", "twelfth night"], "francis":["henry the fourth"], "vintner":["henry the fourth"], "hostess":["henry the fifth", "henry the fourth", "taming of the shrew"], "sheriff":["henry the fourth", "henry the sixth part 2", "richard the third"], "carrier":["henry the fourth"], "mortimer":["henry the fourth", "henry the sixth part 1"], "glendower":["henry the fourth"], "earl of douglas":["henry the fourth"], "messenger":["antony and cleopatra", "coriolanus", "cymbeline", "hamlet", "henry the eighth", "henry the fifth", "henry the fourth", "henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3", "julius caesar", "king john", "king lear", "macbeth", "measure for measure", "much ado about nothing", "othello", "pericles", "richard the third", "taming of the shrew", "timon of athens", "titus andronicus"], "vernon":["henry the fourth", "henry the sixth part 1"], "worcester":["henry the fourth"], "archbishop of york":["henry the fourth", "richard the third"], "sir michael":["henry the fourth"], "lancaster":["henry the fourth"], "bedford":["henry the fifth", "henry the sixth part 1"], "gloucester":["henry the fifth", "henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3", "king lear", "richard the third"], "exeter":["henry the fifth", "henry the sixth part 1", "henry the sixth part 3"], "of winchester":["henry the sixth part 1"], "charles":["as you like it", "henry the sixth part 1"], "alencon":["henry the sixth part 1"], "reignier":["henry the sixth part 1"], "bastard of orleans":["henry the sixth part 1"], "joan la pucelle":["henry the sixth part 1"], "first warder":["henry the sixth part 1"], "second warder":["henry the sixth part 1"], "woodvile":["henry the sixth part 1"], "mayor":["henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3"], "officer":["a comedy of errors", "a winters tale", "coriolanus", "henry the sixth part 1"], "boy":["henry the eighth", "henry the fifth", "henry the sixth part 1", "much ado about nothing", "richard the third", "troilus and cressida"], "salisbury":["henry the fifth", "henry the sixth part 1", "henry the sixth part 2", "king john"], "talbot":["henry the sixth part 1"], "gargrave":["henry the sixth part 1"], "glansdale":["henry the sixth part 1"], "sergeant":["henry the eighth", "henry the sixth part 1", "macbeth"], "first sentinel":["henry the sixth part 1"], "burgundy":["henry the fifth", "henry the sixth part 1", "king lear"], "sentinels":["henry the sixth part 1"], "soldier":["antony and cleopatra", "henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3", "timon of athens"], "captain":["antony and cleopatra", "cymbeline", "hamlet", "henry the sixth part 1", "henry the sixth part 2", "king lear", "richard the second", "titus andronicus", "twelfth night"], "of auvergne":["henry the sixth part 1"], "porter":["henry the eighth", "henry the sixth part 1", "macbeth"], "plantagenet":["henry the sixth part 1"], "suffolk":["henry the eighth", "henry the sixth part 1", "henry the sixth part 2"], "somerset":["henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3"], "warwick":["henry the fifth", "henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3"], "lawyer":["henry the sixth part 1"], "first gaoler":["cymbeline", "henry the sixth part 1"], "king henry the sixth":["henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3"], "all":["a midsummer nights dream", "alls well that ends well", "antony and cleopatra", "coriolanus", "cymbeline", "hamlet", "henry the eighth", "henry the fifth", "henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3", "julius caesar", "macbeth", "merchant of venice", "merry wives of windsor", "othello", "pericles", "richard the second", "richard the third", "taming of the shrew", "timon of athens", "titus andronicus", "troilus and cressida"], "first soldier":["alls well that ends well", "antony and cleopatra", "coriolanus", "henry the sixth part 1", "julius caesar"], "watch":["henry the sixth part 1"], "fastolfe":["henry the sixth part 1"], "basset":["henry the sixth part 1"], "york":["henry the fifth", "henry the sixth part 1", "henry the sixth part 2", "henry the sixth part 3", "richard the third"], "general":["henry the sixth part 1"], "lucy":["henry the sixth part 1"], "john talbot":["henry the sixth part 1"], "legate":["henry the sixth part 1"], "scout":["henry the sixth part 1"], "margaret":["henry the sixth part 1", "much ado about nothing"], "su ffolk":["henry the sixth part 1"], "shepherd":["a winters tale", "henry the sixth part 1"], "queen margaret":["henry the sixth part 2", "henry the sixth part 3", "richard the third"], "cardinal":["henry the sixth part 2", "richard the third"], "buckingham":["henry the eighth", "henry the sixth part 2", "richard the third"], "duchess":["henry the sixth part 2", "richard the second"], "hume":["henry the sixth part 2"], "first petitioner":["henry the sixth part 2"], "second petitioner":["henry the sixth part 2"], "peter":["henry the sixth part 2", "king john", "romeo and juliet", "taming of the shrew"], "horner":["henry the sixth part 2"], "bolingbroke":["henry the sixth part 2"], "spirit":["henry the sixth part 2"], "margaret jourdain":["henry the sixth part 2"], "townsman":["henry the sixth part 2"], "simpcox":["henry the sixth part 2"], "wife":["henry the sixth part 2"], "beadle":["henry the sixth part 2"], "both":["alls well that ends well", "coriolanus", "henry the eighth", "henry the sixth part 2", "pericles", "richard the third", "timon of athens"], "first neighbour":["henry the sixth part 2"], "second neighbour":["henry the sixth part 2"], "third neighbour":["henry the sixth part 2"], "servants":["henry the sixth part 2", "timon of athens"], "herald":["coriolanus", "henry the fifth", "henry the sixth part 2", "king lear", "othello"], "stanley":["henry the sixth part 2", "richard the third"], "post":["henry the sixth part 2", "henry the sixth part 3"], "first murderer":["henry the sixth part 2", "macbeth", "richard the third"], "second murderer":["henry the sixth part 2", "macbeth", "richard the third"], "first murder":["henry the sixth part 2"], "commons":["henry the sixth part 2"], "vaux":["henry the eighth", "henry the sixth part 2"], "first gentleman":["a winters tale", "alls well that ends well", "cymbeline", "henry the eighth", "henry the sixth part 2", "measure for measure", "othello", "pericles"], "master":["henry the sixth part 2", "the tempest"], "second gentleman":["a winters tale", "alls well that ends well", "cymbeline", "henry the eighth", "henry the sixth part 2", "measure for measure", "othello", "pericles"], "whitmore":["henry the sixth part 2"], "bevis":["henry the sixth part 2"], "holland":["henry the sixth part 2"], "cade":["henry the sixth part 2"], "dick":["henry the sixth part 2"], "smith":["henry the sixth part 2"], "clerk":["henry the sixth part 2", "merchant of venice"], "michael":["henry the sixth part 2"], "sir humphrey":["henry the sixth part 2"], "william stafford":["henry the sixth part 2"], "say":["henry the sixth part 2"], "scales":["henry the sixth part 2"], "first citizen":["coriolanus", "henry the sixth part 2", "julius caesar", "king john", "richard the third", "romeo and juliet"], "clifford":["henry the sixth part 2", "henry the sixth part 3"], "iden":["henry the sixth part 2"], "edward":["henry the sixth part 2", "henry the sixth part 3"], "richard":["henry the sixth part 2", "henry the sixth part 3"], "young clifford":["henry the sixth part 2"], "montague":["henry the sixth part 3", "romeo and juliet"], "norfolk":["henry the eighth", "henry the sixth part 3", "richard the third"], "prince edward":["henry the sixth part 3", "richard the third"], "john mortimer":["henry the sixth part 3"], "rutland":["henry the sixth part 3"], "tutor":["henry the sixth part 3"], "prince":["henry the sixth part 3", "romeo and juliet"], "george":["henry the sixth part 3"], "son":["henry the sixth part 3", "macbeth"], "father":["henry the sixth part 3"], "first keeper":["henry the sixth part 3"], "second keeper":["henry the sixth part 3"], "king edward the fourth":["henry the sixth part 3", "richard the third"], "clarence":["henry the sixth part 3", "richard the third"], "lady grey":["henry the sixth part 3"], "nobleman":["henry the sixth part 3"], "king lewis the eleventh":["henry the sixth part 3"], "oxford":["henry the sixth part 3", "richard the third"], "bona":["henry the sixth part 3"], "hastings":["henry the sixth part 3", "richard the third"], "queen elizabeth":["henry the sixth part 3", "richard the third"], "first watchman":["henry the sixth part 3", "much ado about nothing", "romeo and juliet"], "second watchman":["henry the sixth part 3", "much ado about nothing", "romeo and juliet"], "third watchman":["henry the sixth part 3", "romeo and juliet"], "rivers":["henry the sixth part 3", "richard the third"], "huntsman":["henry the sixth part 3"], "lieutenant":["coriolanus", "henry the sixth part 3"], "first messenger":["henry the sixth part 3"], "second messenger":["antony and cleopatra", "coriolanus", "henry the sixth part 3", "richard the third"], "countess":["alls well that ends well"], "bertram":["alls well that ends well"], "lafeu":["alls well that ends well"], "helena":["a midsummer nights dream", "alls well that ends well"], "parolles":["alls well that ends well"], "page":["alls well that ends well", "merry wives of windsor", "richard the third", "romeo and juliet", "taming of the shrew", "timon of athens"], "king":["alls well that ends well"], "first lord":["a winters tale", "alls well that ends well", "as you like it", "coriolanus", "cymbeline", "loves labours lost", "pericles", "timon of athens"], "second lord":["alls well that ends well", "as you like it", "coriolanus", "cymbeline", "pericles", "timon of athens"], "steward":["alls well that ends well"], "clown":["a winters tale", "alls well that ends well", "antony and cleopatra", "othello", "titus andronicus", "twelfth night"], "fourth lord":["alls well that ends well", "timon of athens"], "duke":["alls well that ends well", "measure for measure", "merchant of venice", "two gentlemen of verona"], "widow":["alls well that ends well", "taming of the shrew"], "diana":["alls well that ends well", "pericles"], "mariana":["alls well that ends well", "measure for measure"], "second soldier":["alls well that ends well", "antony and cleopatra", "coriolanus", "julius caesar"], "gentleman":["a winters tale", "alls well that ends well", "hamlet", "henry the eighth", "king lear", "othello", "richard the third"], "orlando":["as you like it"], "adam":["as you like it"], "oliver":["as you like it"], "dennis":["as you like it"], "celia":["as you like it"], "rosalind":["as you like it"], "touchstone":["as you like it"], "le beau":["as you like it"], "duke frederick":["as you like it"], "duke senior":["as you like it"], "amiens":["as you like it"], "corin":["as you like it"], "silvius":["as you like it"], "jaques":["as you like it"], "audrey":["as you like it"], "sir oliver martext":["as you like it"], "phebe":["as you like it"], "a lord":["as you like it"], "forester":["as you like it", "loves labours lost"], "william":["as you like it"], "first page":["as you like it"], "second page":["as you like it"], "hymen":["as you like it"], "jaques de boys":["as you like it"], "philo":["antony and cleopatra"], "cleopatra":["antony and cleopatra"], "mark antony":["antony and cleopatra"], "attendant":["antony and cleopatra", "cymbeline", "macbeth"], "demetrius":["a midsummer nights dream", "antony and cleopatra", "titus andronicus"], "charmian":["antony and cleopatra"], "alexas":["antony and cleopatra"], "soothsayer":["antony and cleopatra", "cymbeline", "julius caesar"], "domitius enobarbus":["antony and cleopatra"], "iras":["antony and cleopatra"], "first attendant":["antony and cleopatra"], "second attendant":["antony and cleopatra"], "octavius caesar":["antony and cleopatra"], "lepidus":["antony and cleopatra", "julius caesar"], "mardian":["antony and cleopatra"], "pompey":["antony and cleopatra", "measure for measure"], "menecrates":["antony and cleopatra"], "menas":["antony and cleopatra"], "varrius":["antony and cleopatra"], "mecaenas":["antony and cleopatra"], "agrippa":["antony and cleopatra"], "octavia":["antony and cleopatra"], "attendants":["antony and cleopatra"], "first servant":["a winters tale", "antony and cleopatra", "king lear", "merry wives of windsor", "pericles", "romeo and juliet", "taming of the shrew", "timon of athens"], "second servant":["a winters tale", "antony and cleopatra", "king lear", "merry wives of windsor", "romeo and juliet", "taming of the shrew", "timon of athens"], "ventidius":["antony and cleopatra", "timon of athens"], "silius":["antony and cleopatra"], "eros":["antony and cleopatra"], "canidius":["antony and cleopatra"], "taurus":["antony and cleopatra"], "scarus":["antony and cleopatra"], "dolabella":["antony and cleopatra"], "euphronius":["antony and cleopatra"], "thyreus":["antony and cleopatra"], "third soldier":["antony and cleopatra", "julius caesar"], "fourth soldier":["antony and cleopatra"], "first guard":["antony and cleopatra"], "second guard":["antony and cleopatra"], "third guard":["antony and cleopatra"], "dercetas":["antony and cleopatra"], "diomedes":["antony and cleopatra", "troilus and cressida"], "egyptian":["antony and cleopatra"], "proculeius":["antony and cleopatra"], "gallus":["antony and cleopatra"], "seleucus":["antony and cleopatra"], "guard":["antony and cleopatra"], "aegeon":["a comedy of errors"], "duke solinus":["a comedy of errors"], "gaoler":["a comedy of errors", "a winters tale"], "first merchant":["a comedy of errors"], "of syracuse":["a comedy of errors"], "dromio of syracuse":["a comedy of errors"], "dromio of ephesus":["a comedy of errors"], "adriana":["a comedy of errors"], "luciana":["a comedy of errors"], "of ephesus":["a comedy of errors"], "balthazar":["a comedy of errors"], "luce":["a comedy of errors"], "antipholus":["a comedy of errors"], "angelo":["a comedy of errors", "measure for measure"], "second merchant":["a comedy of errors"], "courtezan":["a comedy of errors"], "pinch":["a comedy of errors"], "aemelia":["a comedy of errors"], "second citizen":["coriolanus", "julius caesar", "richard the third"], "menenius":["coriolanus"], "marcius":["coriolanus"], "first senator":["coriolanus", "cymbeline", "othello", "timon of athens"], "cominius":["coriolanus"], "titus":["coriolanus", "timon of athens"], "sicinius":["coriolanus"], "brutus":["coriolanus", "julius caesar"], "aufidius":["coriolanus"], "second senator":["coriolanus", "cymbeline", "othello", "timon of athens"], "volumnia":["coriolanus"], "virgilia":["coriolanus"], "gentlewoman":["coriolanus", "macbeth"], "valeria":["coriolanus"], "lartius":["coriolanus"], "first roman":["coriolanus"], "second roman":["coriolanus"], "third roman":["coriolanus"], "coriolanus":["coriolanus"], "first officer":["coriolanus", "othello", "twelfth night"], "second officer":["coriolanus", "twelfth night"], "senators":["coriolanus"], "third citizen":["coriolanus", "julius caesar", "richard the third"], "fourth citizen":["coriolanus", "julius caesar"], "fifth citizen":["coriolanus"], "both citizens":["coriolanus"], "sixth citizen":["coriolanus"], "seventh citizen":["coriolanus"], "all citizens":["coriolanus"], "citizens":["coriolanus", "julius caesar", "richard the third"], "aedile":["coriolanus"], "a patrician":["coriolanus"], "second patrician":["coriolanus"], "both tribunes":["coriolanus"], "roman":["coriolanus"], "volsce":["coriolanus"], "citizen":["coriolanus"], "first servingman":["coriolanus"], "second servingman":["coriolanus"], "third servingman":["coriolanus"], "young marcius":["coriolanus"], "first conspirator":["coriolanus"], "second conspirator":["coriolanus"], "third conspirator":["coriolanus"], "all the lords":["coriolanus"], "lords":["a winters tale", "coriolanus", "cymbeline", "macbeth", "richard the third"], "all conspirators":["coriolanus"], "all the people":["coriolanus"], "third lord":["coriolanus", "pericles", "timon of athens"], "queen":["cymbeline", "richard the second"], "posthumus leonatus":["cymbeline"], "imogen":["cymbeline"], "cymbeline":["cymbeline"], "pisanio":["cymbeline"], "cloten":["cymbeline"], "lady":["cymbeline", "richard the second"], "iachimo":["cymbeline"], "philario":["cymbeline"], "frenchman":["cymbeline"], "first lady":["a winters tale", "cymbeline", "timon of athens"], "cornelius":["cymbeline"], "null":["cymbeline"], "caius lucius":["cymbeline"], "belarius":["cymbeline"], "guiderius":["cymbeline"], "arviragus":["cymbeline"], "first tribune":["cymbeline"], "lord":["a winters tale", "cymbeline", "hamlet", "macbeth", "much ado about nothing", "pericles", "richard the second", "taming of the shrew"], "first captain":["cymbeline"], "second captain":["cymbeline"], "second gaoler":["cymbeline"], "sicilius leonatus":["cymbeline"], "mother":["cymbeline"], "first brother":["cymbeline"], "second brother":["cymbeline"], "jupiter":["cymbeline"], "bernardo":["hamlet"], "francisco":["hamlet", "the tempest"], "horatio":["hamlet"], "marcellus":["hamlet"], "king claudius":["hamlet"], "voltimand":["hamlet"], "laertes":["hamlet"], "lord polonius":["hamlet"], "hamlet":["hamlet"], "queen gertrude":["hamlet"], "ophelia":["hamlet"], "ghost":["hamlet", "julius caesar"], "reynaldo":["hamlet"], "rosencrantz":["hamlet"], "guildenstern":["hamlet"], "first player":["hamlet"], "prologue":["a midsummer nights dream", "hamlet"], "player king":["hamlet"], "player queen":["hamlet"], "lucianus":["hamlet"], "prince fortinbras":["hamlet"], "danes":["hamlet"], "first sailor":["hamlet", "pericles"], "first clown":["hamlet"], "second clown":["hamlet"], "first priest":["hamlet"], "osric":["hamlet"], "first ambassador":["hamlet", "henry the fifth"], "chorus":["henry the fifth", "romeo and juliet"], "canterbury":["henry the fifth"], "ely":["henry the fifth"], "king henry the fifth":["henry the fifth"], "nym":["henry the fifth", "merry wives of windsor"], "pistol":["henry the fifth", "merry wives of windsor"], "scroop":["henry the fifth"], "cambridge":["henry the fifth"], "grey":["henry the fifth", "richard the third"], "king of france":["henry the fifth", "king lear"], "dauphin":["henry the fifth"], "constable":["henry the fifth"], "fluellen":["henry the fifth"], "gower":["henry the fifth", "pericles"], "jamy":["henry the fifth"], "macmorris":["henry the fifth"], "governor":["henry the fifth"], "katharine":["henry the eighth", "henry the fifth", "loves labours lost"], "alice":["henry the fifth"], "bourbon":["henry the fifth"], "montjoy":["henry the fifth"], "orleans":["henry the fifth"], "rambures":["henry the fifth"], "erpingham":["henry the fifth"], "court":["henry the fifth"], "bates":["henry the fifth"], "williams":["henry the fifth"], "grandpre":["henry the fifth"], "french soldier":["henry the fifth"], "queen isabel":["henry the fifth"], "french king":["henry the fifth"], "abergavenny":["henry the eighth"], "cardinal wolsey":["henry the eighth"], "first secretary":["henry the eighth"], "brandon":["henry the eighth"], "king henry the eighth":["henry the eighth"], "queen katharine":["henry the eighth"], "surveyor":["henry the eighth"], "sands":["henry the eighth"], "lovell":["henry the eighth"], "guildford":["henry the eighth"], "anne":["henry the eighth"], "cardinal campeius":["henry the eighth"], "gardiner":["henry the eighth"], "old lady":["henry the eighth"], "scribe":["henry the eighth"], "crier":["henry the eighth"], "griffith":["henry the eighth"], "lincoln":["henry the eighth"], "surrey":["henry the eighth", "richard the third"], "cromwell":["henry the eighth"], "third gentleman":["a winters tale", "henry the eighth", "othello"], "patience":["henry the eighth"], "capucius":["henry the eighth"], "denny":["henry the eighth"], "cranmer":["henry the eighth"], "keeper":["henry the eighth", "richard the second"], "doctor butts":["henry the eighth"], "chancellor":["henry the eighth"], "man":["henry the eighth"], "garter":["henry the eighth"], "king john":["king john"], "chatillon":["king john"], "queen elinor":["king john"], "essex":["king john"], "bastard":["king john"], "robert":["king john"], "lady faulconbridge":["king john"], "gurney":["king john"], "lewis":["king john"], "arthur":["king john"], "austria":["king john"], "constance":["king john"], "king philip":["king john"], "blanch":["king john"], "french herald":["king john"], "english herald":["king john"], "cardinal pandulph":["king john"], "elinor":["king john"], "hubert":["king john"], "first executioner":["king john"], "pembroke":["king john"], "bigot":["king john"], "melun":["king john"], "flavius":["julius caesar", "timon of athens"], "first commoner":["julius caesar"], "marullus":["julius caesar"], "second commoner":["julius caesar"], "caesar":["julius caesar"], "casca":["julius caesar"], "calpurnia":["julius caesar"], "antony":["julius caesar"], "cassius":["julius caesar"], "cicero":["julius caesar"], "cinna":["julius caesar"], "lucius":["julius caesar", "titus andronicus"], "decius brutus":["julius caesar"], "metellus cimber":["julius caesar"], "trebonius":["julius caesar"], "portia":["julius caesar", "merchant of venice"], "ligarius":["julius caesar"], "publius":["julius caesar", "titus andronicus"], "artemidorus":["julius caesar"], "popilius":["julius caesar"], "several citizens":["julius caesar"], "cinna the poet":["julius caesar"], "octavius":["julius caesar"], "lucilius":["julius caesar", "timon of athens"], "pindarus":["julius caesar"], "poet":["julius caesar", "timon of athens"], "messala":["julius caesar"], "varro":["julius caesar"], "claudius":["julius caesar"], "titinius":["julius caesar"], "cato":["julius caesar"], "clitus":["julius caesar"], "dardanius":["julius caesar"], "volumnius":["julius caesar"], "strato":["julius caesar"], "kent":["king lear"], "edmund":["king lear"], "king lear":["king lear"], "goneril":["king lear"], "cordelia":["king lear"], "lear":["king lear"], "regan":["king lear"], "cornwall":["king lear"], "edgar":["king lear"], "oswald":["king lear"], "knight":["king lear"], "fool":["king lear", "timon of athens"], "albany":["king lear"], "curan":["king lear"], "third servant":["king lear", "taming of the shrew", "timon of athens"], "old man":["king lear", "macbeth"], "doctor":["king lear", "macbeth"], "ferdinand":["loves labours lost", "the tempest"], "longaville":["loves labours lost"], "dumain":["loves labours lost"], "biron":["loves labours lost"], "dull":["loves labours lost"], "costard":["loves labours lost"], "adriano de armado":["loves labours lost"], "moth":["a midsummer nights dream", "loves labours lost"], "armado":["loves labours lost"], "jaquenetta":["loves labours lost"], "boyet":["loves labours lost"], "princess":["loves labours lost"], "maria":["loves labours lost", "twelfth night"], "rosaline":["loves labours lost"], "sir nathaniel":["loves labours lost"], "holofernes":["loves labours lost"], "mercade":["loves labours lost"], "first witch":["macbeth"], "second witch":["macbeth"], "third witch":["macbeth"], "duncan":["macbeth"], "malcolm":["macbeth"], "lennox":["macbeth"], "ross":["macbeth"], "macbeth":["macbeth"], "banquo":["macbeth"], "angus":["macbeth"], "lady macbeth":["macbeth"], "fleance":["macbeth"], "macduff":["macbeth"], "donalbain":["macbeth"], "both murderers":["macbeth"], "third murderer":["macbeth"], "hecate":["macbeth"], "first apparition":["macbeth"], "second apparition":["macbeth"], "third apparition":["macbeth"], "lady macduff":["macbeth"], "menteith":["macbeth"], "caithness":["macbeth"], "seyton":["macbeth"], "siward":["macbeth"], "soldiers":["macbeth"], "young siward":["macbeth"], "duke vincentio":["measure for measure"], "escalus":["measure for measure"], "lucio":["measure for measure"], "mistress overdone":["measure for measure"], "claudio":["measure for measure", "much ado about nothing"], "provost":["measure for measure"], "friar thomas":["measure for measure"], "isabella":["measure for measure"], "francisca":["measure for measure"], "elbow":["measure for measure"], "froth":["measure for measure"], "pomphey":["measure for measure"], "justice":["measure for measure"], "juliet":["measure for measure", "romeo and juliet"], "abhorson":["measure for measure"], "barnardine":["measure for measure"], "friar peter":["measure for measure"], "antonio":["merchant of venice", "much ado about nothing", "the tempest", "twelfth night", "two gentlemen of verona"], "salarino":["merchant of venice"], "salanio":["merchant of venice"], "bassanio":["merchant of venice"], "lorenzo":["merchant of venice"], "gratiano":["merchant of venice", "othello"], "nerissa":["merchant of venice"], "shylock":["merchant of venice"], "morocco":["merchant of venice"], "launcelot":["merchant of venice"], "gobbo":["merchant of venice"], "leonardo":["merchant of venice"], "jessica":["merchant of venice"], "arragon":["merchant of venice"], "tubal":["merchant of venice"], "salerio":["merchant of venice"], "balthasar":["merchant of venice", "much ado about nothing", "romeo and juliet"], "stephano":["merchant of venice", "the tempest"], "shallow":["merry wives of windsor"], "slender":["merry wives of windsor"], "sir hugh evans":["merry wives of windsor"], "simple":["merry wives of windsor"], "anne page":["merry wives of windsor"], "host":["merry wives of windsor", "two gentlemen of verona"], "mistress quickly":["merry wives of windsor"], "rugby":["merry wives of windsor"], "doctor caius":["merry wives of windsor"], "fenton":["merry wives of windsor"], "mistress page":["merry wives of windsor"], "mistress ford":["merry wives of windsor"], "ford":["merry wives of windsor"], "robin":["merry wives of windsor"], "william page":["merry wives of windsor"], "theseus":["a midsummer nights dream"], "hippolyta":["a midsummer nights dream"], "egeus":["a midsummer nights dream"], "hermia":["a midsummer nights dream"], "lysander":["a midsummer nights dream"], "quince":["a midsummer nights dream"], "bottom":["a midsummer nights dream"], "flute":["a midsummer nights dream"], "starveling":["a midsummer nights dream"], "snout":["a midsummer nights dream"], "snug":["a midsummer nights dream"], "puck":["a midsummer nights dream"], "fairy":["a midsummer nights dream"], "oberon":["a midsummer nights dream"], "titania":["a midsummer nights dream"], "peaseblossom":["a midsummer nights dream"], "cobweb":["a midsummer nights dream"], "mustardseed":["a midsummer nights dream"], "hernia":["a midsummer nights dream"], "philostrate":["a midsummer nights dream"], "wall":["a midsummer nights dream"], "pyramus":["a midsummer nights dream"], "thisbe":["a midsummer nights dream"], "lion":["a midsummer nights dream"], "moonshine":["a midsummer nights dream"], "leonato":["much ado about nothing"], "beatrice":["much ado about nothing"], "hero":["much ado about nothing"], "don pedro":["much ado about nothing"], "benedick":["much ado about nothing"], "don john":["much ado about nothing"], "conrade":["much ado about nothing"], "borachio":["much ado about nothing"], "ursula":["much ado about nothing"], "dogberry":["much ado about nothing"], "verges":["much ado about nothing"], "watchman":["much ado about nothing"], "friar francis":["much ado about nothing"], "sexton":["much ado about nothing"], "roderigo":["othello"], "iago":["othello"], "brabantio":["othello"], "othello":["othello"], "cassio":["othello"], "duke of venice":["othello"], "sailor":["othello"], "senator":["othello", "timon of athens"], "desdemona":["othello"], "montano":["othello"], "fourth gentleman":["othello"], "second gentlemen":["othello"], "emilia":["a winters tale", "othello"], "first musician":["othello", "romeo and juliet"], "bianca":["othello", "taming of the shrew"], "lodovico":["othello"], "antiochus":["pericles"], "pericles":["pericles"], "daughter":["pericles"], "thaliard":["pericles"], "helicanus":["pericles"], "cleon":["pericles"], "dionyza":["pericles"], "first fisherman":["pericles"], "second fisherman":["pericles"], "third fisherman":["pericles"], "simonides":["pericles"], "thaisa":["pericles"], "knights":["pericles"], "marshal":["pericles"], "first knight":["pericles"], "escanes":["pericles"], "second knight":["pericles"], "third knight":["pericles"], "lychorida":["pericles"], "second sailor":["pericles"], "cerimon":["pericles"], "philemon":["pericles"], "leonine":["pericles"], "marina":["pericles"], "first pirate":["pericles"], "second pirate":["pericles"], "third pirate":["pericles"], "pandar":["pericles"], "boult":["pericles"], "bawd":["pericles"], "lysimachus":["pericles"], "tyrian sailor":["pericles"], "king richard the second":["richard the second"], "john of gaunt":["richard the second"], "henry bolingbroke":["richard the second"], "thomas mowbray":["richard the second"], "lord marshal":["richard the second"], "duke of aumerle":["richard the second"], "first herald":["richard the second"], "second herald":["richard the second"], "green":["richard the second"], "bushy":["richard the second"], "duke of york":["richard the second"], "lord ross":["richard the second"], "lord willoughby":["richard the second"], "bagot":["richard the second"], "henry percy":["richard the second"], "lord berkeley":["richard the second"], "earl of salisbury":["richard the second"], "bishop of carlisle":["richard the second"], "sir stephen scroop":["richard the second"], "gardener":["richard the second"], "lord fitzwater":["richard the second"], "duke of surrey":["richard the second"], "abbot":["richard the second"], "duchess of york":["richard the second", "richard the third"], "exton":["richard the second"], "groom":["richard the second"], "brakenbury":["richard the third"], "lady anne":["richard the third"], "gentlemen":["richard the third"], "derby":["richard the third"], "dorset":["richard the third"], "catesby":["richard the third"], "girl":["richard the third"], "children":["richard the third"], "lord mayor":["richard the third"], "lord stanley":["richard the third"], "pursuivant":["richard the third"], "priest":["richard the third", "twelfth night"], "ratcliff":["richard the third"], "vaughan":["richard the third"], "bishop of ely":["richard the third"], "lovel":["richard the third"], "scrivener":["richard the third"], "another":["richard the third"], "king richard the third":["richard the third"], "tyrrel":["richard the third"], "third messenger":["richard the third"], "fourth messenger":["richard the third"], "christopher":["richard the third"], "richmond":["richard the third"], "herbert":["richard the third"], "blunt":["richard the third"], "of prince edward":["richard the third"], "of king henry the sixth":["richard the third"], "ghost of clarence":["richard the third"], "ghost of rivers":["richard the third"], "ghost of grey":["richard the third"], "ghost of vaughan":["richard the third"], "ghost of hastings":["richard the third"], "of young princes":["richard the third"], "ghost of lady anne":["richard the third"], "of buckingham":["richard the third"], "sampson":["romeo and juliet"], "gregory":["romeo and juliet"], "abraham":["romeo and juliet"], "benvolio":["romeo and juliet"], "tybalt":["romeo and juliet"], "capulet":["romeo and juliet"], "lady capulet":["romeo and juliet"], "lady montague":["romeo and juliet"], "romeo":["romeo and juliet"], "paris":["romeo and juliet", "troilus and cressida"], "nurse":["romeo and juliet", "titus andronicus"], "mercutio":["romeo and juliet"], "second capulet":["romeo and juliet"], "friar laurence":["romeo and juliet"], "lady  capulet":["romeo and juliet"], "second musician":["romeo and juliet"], "musician":["romeo and juliet"], "third musician":["romeo and juliet"], "apothecary":["romeo and juliet"], "friar john":["romeo and juliet"], "sly":["taming of the shrew"], "first huntsman":["taming of the shrew"], "second huntsman":["taming of the shrew"], "players":["taming of the shrew"], "a player":["taming of the shrew"], "lucentio":["taming of the shrew"], "tranio":["taming of the shrew"], "baptista":["taming of the shrew"], "gremio":["taming of the shrew"], "katharina":["taming of the shrew"], "hortensio":["taming of the shrew"], "hortensia":["taming of the shrew"], "biondello":["taming of the shrew"], "petruchio":["taming of the shrew"], "grumio":["taming of the shrew"], "katarina":["taming of the shrew"], "curtis":["taming of the shrew"], "nathaniel":["taming of the shrew"], "philip":["taming of the shrew"], "joseph":["taming of the shrew"], "nicholas":["taming of the shrew"], "pedant":["taming of the shrew"], "haberdasher":["taming of the shrew"], "tailor":["taming of the shrew"], "vincentio":["taming of the shrew"], "boatswain":["the tempest"], "alonso":["the tempest"], "gonzalo":["the tempest"], "sebastian":["the tempest", "twelfth night"], "mariners":["the tempest"], "miranda":["the tempest"], "prospero":["the tempest"], "ariel":["the tempest"], "caliban":["the tempest"], "adrian":["the tempest"], "trinculo":["the tempest"], "iris":["the tempest"], "ceres":["the tempest"], "juno":["the tempest"], "painter":["timon of athens"], "merchant":["timon of athens"], "jeweller":["timon of athens"], "timon":["timon of athens"], "old athenian":["timon of athens"], "apemantus":["timon of athens"], "alcibiades":["timon of athens"], "cupid":["timon of athens"], "all ladies":["timon of athens"], "all lords":["timon of athens"], "caphis":["timon of athens"], "all servants":["timon of athens"], "flaminius":["timon of athens"], "lucullus":["timon of athens"], "first stranger":["timon of athens"], "second stranger":["timon of athens"], "servilius":["timon of athens"], "third stranger":["timon of athens"], "sempronius":["timon of athens"], "hortensius":["timon of athens"], "philotus":["timon of athens"], "third senator":["timon of athens"], "some speak":["timon of athens"], "some others":["timon of athens"], "phrynia":["timon of athens"], "timandra":["timon of athens"], "first bandit":["timon of athens"], "second bandit":["timon of athens"], "third bandit":["timon of athens"], "banditti":["timon of athens"], "saturninus":["titus andronicus"], "bassianus":["titus andronicus"], "marcus andronicus":["titus andronicus"], "titus andronicus":["titus andronicus"], "tamora":["titus andronicus"], "chiron":["titus andronicus"], "lavinia":["titus andronicus"], "tribunes":["titus andronicus"], "mutius":["titus andronicus"], "martius":["titus andronicus"], "quintus":["titus andronicus"], "aaron":["titus andronicus"], "marcus":["titus andronicus"], "young lucius":["titus andronicus"], "aemilius":["titus andronicus"], "first goth":["titus andronicus"], "all the goths":["titus andronicus"], "second goth":["titus andronicus"], "third goth":["titus andronicus"], "troilus":["troilus and cressida"], "pandarus":["troilus and cressida"], "aeneas":["troilus and cressida"], "cressida":["troilus and cressida"], "alexander":["troilus and cressida"], "agamemnon":["troilus and cressida"], "nestor":["troilus and cressida"], "ulysses":["troilus and cressida"], "menelaus":["troilus and cressida"], "ajax":["troilus and cressida"], "thersites":["troilus and cressida"], "achilles":["troilus and cressida"], "patroclus":["troilus and cressida"], "priam":["troilus and cressida"], "hector":["troilus and cressida"], "helenus":["troilus and cressida"], "cassandra":["troilus and cressida"], "helen":["troilus and cressida"], "calchas":["troilus and cressida"], "deiphobus":["troilus and cressida"], "andromache":["troilus and cressida"], "margarelon":["troilus and cressida"], "myrmidons":["troilus and cressida"], "duke orsino":["twelfth night"], "curio":["twelfth night"], "valentine":["twelfth night", "two gentlemen of verona"], "viola":["twelfth night"], "sir toby belch":["twelfth night"], "sir andrew":["twelfth night"], "olivia":["twelfth night"], "malvolio":["twelfth night"], "fabian":["twelfth night"], "proteus":["two gentlemen of verona"], "speed":["two gentlemen of verona"], "julia":["two gentlemen of verona"], "lucetta":["two gentlemen of verona"], "panthino":["two gentlemen of verona"], "silvia":["two gentlemen of verona"], "launce":["two gentlemen of verona"], "thurio":["two gentlemen of verona"], "first outlaw":["two gentlemen of verona"], "second outlaw":["two gentlemen of verona"], "third outlaw":["two gentlemen of verona"], "eglamour":["two gentlemen of verona"], "outlaws":["two gentlemen of verona"], "archidamus":["a winters tale"], "camillo":["a winters tale"], "polixenes":["a winters tale"], "leontes":["a winters tale"], "hermione":["a winters tale"], "mamillius":["a winters tale"], "second lady":["a winters tale"], "antigonus":["a winters tale"], "paulina":["a winters tale"], "cleomenes":["a winters tale"], "dion":["a winters tale"], "mariner":["a winters tale"], "time":["a winters tale"], "autolycus":["a winters tale"], "florizel":["a winters tale"], "perdita":["a winters tale"], "dorcas":["a winters tale"], "mopsa":["a winters tale"], "shepard":["a winters tale"]]
}