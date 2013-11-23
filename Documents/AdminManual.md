Admin Manual
==================
1. Uppsetning á git og heroku
====
Fyrst þarftu að ná í git, setja upp ssh key og ná í heroku toolbelt

Best er að fylgja þessum leiðbeiningum

 - https://help.github.com/articles/set-up-git
 - https://help.github.com/articles/generating-ssh-keys
 - https://devcenter.heroku.com/articles/quickstart

2. Ná í og deploya
====
Síðan þarftu að sækja repository-ið með

 - git pull http://github.com/DSTechSupport/tictactoe

færa þig síðann í directory-ið sem git sótti

 - cd tictactoe/

og færa það á heroku serverinn þinn með 

 - git push heroku master

3. Maintainance
====
Ef þú þarft að sækja nýja útgáfu og uppfæra á servernum þínum þá þarftu að vera í tictactoe/ directory og keyra eftirfarandi:
 - git pull
 - git push heroku master
