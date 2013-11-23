Development Manual
==================

Þróunarhandbók þessi er ætluð til þess að lýsa hvað þarf til að keyra eftirfarandi verkefni á ný uppsettri vél. 
Eftirfarandi forrit eru nauðsynleg til að keyra þetta verkefni

   Git

   Apache-Maven 3.0.4

   Java JDK version 7

Til þess að setja upp verkefni á uppsettri ubuntu vél. Þarf að fylgja eftirfarandi skrefum:

1.Uppsetning á Git
====
Fyrsta skrefið er að heimsækja slóðina https://github.com/join og búa til aðgang að github ef þú ert ekki nú þegar með svoleiðis aðgang. Því næst þarf að bæta notandanum í rétt “Organization” sem í þessu tilfelli er þróunarteymið Deep Space Tech Support. Stofnandi af “Organization” þarf að samþykkja þig inn í hópinn. Þetta er gert til þess að allir meðlimir hópsins hafi aðgang að sama Repository. 

Frekari upplýsingar um uppsetningu á Git má nálgast í eftirfarandi hlekk: https://help.github.com/articles/set-up-git
Hér eru svo leiðbeiningar til að nálgast SSH lykilinn
https://help.github.com/articles/generating-ssh-keys


2. Stýrikerfi
====

Notast skal við Linux. Ef viðkomandi er ekki með linux uppsett getur hann notast við þjónustu sem www.greenqloud.com bjóða og unnið í gegnum skel.

3. Sækja Maven og Java og velja rétt environment
====

- Í skelinni sjálfri þarf að framkvæma eftirfarandi skipanir sem setja upp forrit sem nauðsynleg eru til að geta keyrt verkefnið 
   sudo apt-get install git (setur upp git á skelinni)
   sudo apt-get install maven (setur upp maven á skelinni)
   sudo apt-get install openjdk-7-jdk (setur upp Java JDK version 7)
   sudo apt-get install openjdk-7-jre (setur upp Java JDK version /)

Athugið mikilvægt er að velja rétt runtime environment eða java-7-openjdk útgáfuna þetta er gert með eftirfarandi skipun 
sudo update-alternatives --config java

4. Sækja Repositoryið af github
====

Þegar öll viðeigandi forrit eru uppsett er næst á dagskrá að sækja Repositoryið af github. Það er gert á eftir farandi máta.
  1. Búðu til viðeigandi möppu á skelinni þar sem þú vilt geyma Repositoryið.
  2. Farðu inn í þá möppu.
  3. Klónið Repositoryið inn í möppuna sem þú varst að búa til með eftirfarandi skipun: git clone git@github.com:DSTechSupport/tictactoe.git

Þá geturðu byrjað að vinna.

Scriptan bin/build compilar kóðann og keyrir öll unit tests. Ef þú vilt bara compila þá geturðu notað bin/compile

Integration serverinn er 46.149.19.76 og user/pass er build/silver mundu að láta alla vita ef þú þarft að integrata!
Athugið að nú er virkur continuous code integration server á https://travis-ci.org/ skráðu þig inn þar með github og þá færðu að sjá buildin sem hann keyrir
Ef þú vilt þá geturðu samt skráð þig inn á gamla code integration serverinn.

Forritunarreglur
====

Hópurinn setti sér ákveðnar forritunarreglur sem ákveðnar voru í sameiningu og ætlast er til þeim sé fylgt eftir.
 - Skrifa skal allan kóða á ensku, þar með talið falla-, klasa og breytuheiti.
 - Athugasemdir í kóðanum skulu einnig vera ritaðar á ensku.
 - Notast skal við camelCasing fyrir öllu breytunöfn að undanskildum KlasaNöfnum.
 - Allir fastar (Constantar) skulu skrifaðir með hástöfum.
 - Föll og klasanöfn skulu vera lýsandi með tilliti til virkni þeirra.
 - Svigar upp við statement skulu hafa bil við sitthvoran sviga. Dæmi MyFunction( x, y ).
 - Allur kóði skal vera indentaður á sambærilega og skýran hátt.

