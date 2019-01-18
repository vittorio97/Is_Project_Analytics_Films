use progettoIS;

insert into Utente  values
     ("Vincenzo.armenio1@gmail.com","Vincenzo1","Unisa","Amministratore"),
     ("Alina.aprea2@hotmail.it","Alina2","Unisa2","Utente registrato"),
     ("Alberto.girotondo@libero.it","AlbertoG2","AlbyGiro","Utente registrato"),
     ("Lucia.pesca@gmail.com","LuciaPesca1","LuciiP","Visitatore"),
     ("Luchetto98@gmail.com","Luchetto98","Unisa1","Visitatore");
     

insert into FILM  values
    ("Tremors","Fanno la loro terribile apparizione alcuni voraci serpentoni sotterranei. Ciechi, ma sensibili al più piccolo rumore, i vermi colpiscono senza scampo.","locandine/Tremors.jpg","horror","Vincenzo.armenio1@gmail.com"),
    ("ToyStory","La vita di un cowboy giocattolo tanto amato da un bambino è minacciata dall'arrivo di un nuovo robot colorato e pieno di luci.","locandine/ToyStory.jpg","fantastico","Vincenzo.armenio1@gmail.com"),
	("Shutter Island","Rachel Salado, paziente del manicomio criminale sull'isola di Shutter, scompare all'improvviso. L'agente federale Teddy Daniels, affiancato dall'ufficiale Chuck Aule, deve indagare per risolvere il mistero.","locandine/ShutterIsland.jpg","thriller","Vincenzo.armenio1@gmail.com"),
	("Gifted","Uno zio single intraprende una battaglia legale per ottenere la custodia della nipote, giovane prodigio della matematica, e garantirle una vita normale nonostante l'opposizione della madre.","locandine/Gifted.jpg","drammatico","Vincenzo.armenio1@gmail.com"),
	("Avengers", "I leggendari supereroi Iron Man, Hulk, Thor, Capitan America, Occhio di Falco e la Vedova Nera vengono reclutati da un'agenzia governativa segreta per combattere un nemico inatteso che minaccia la sicurezza della Terra","locandine/Avengers.jpg","fantastico","Vincenzo.armenio1@gmail.com"),
    ("Illusionist","In un mondo dove nulla è come appare, un illusionista di nome Einsenheim e l'ispettore di polizia Uhl, si confrontano in una sfida di volontà nel cercare di determinare dove finisce la realtà e dove inizia la magia.","locandine/Illusionist.jpg","drammatico","Vincenzo.armenio1@gmail.com"),
	("Resta con me", "Un violento uragano distrugge il veliero sul quale viaggiano Tami e Richard. A causa delle gravi ferite riportate, la donna è costretta a prendere il comando dell'imbarcazione e salvare entrambi.", "locandine/RestaconMe.jpg","drammatico","Vincenzo.armenio1@gmail.com"),
    ("The imitation game", "La vita del matematico inglese Alan Turing, genio indiscusso del XX secolo, considerato uno dei padri dell'informatica e dei moderni computer, fino alla sua precoce e tragica scomparsa.","TheImitationGame.jpg", "drammatico","Vincenzo.armenio1@gmail.com");


insert into RECENSIONE values
("Gradevole","Tremors è un film trash in contrasto con un epoca di trash al contrario, stabilito ciò lo si può valutare lucidamente. Tremors non è un film spocchioso che nasconde chissà quali allegorie sull'esistenza e non è un gioiello visivo fatto di pura plastica. Tremors(almeno questo capitolo) è un gradevole filmetto che paga un tributo agli anni 50 , ciò alla fine di un decennio più o meno horror legato ai teenagers. Qui cambia tutto, qui i protagonisti sono degli sbandati, solitari reietti in un deserto, spostati e derelitti, questo è il punto interessante al di là della semplice visione, un attacco(inconsapevolmente?) iconoclasta alle dicotomie di un epoca in un mix che ricorda lo scontro tra un John Wayne alcolizzato e disgraziato con il mostro della palude, e qui è il punto, riscoprire a piene mani il passato per staccarsi dai dogmi, questo è il pregio del film.
","2015-05-03","Alina.aprea2@hotmail.it","Tremors"),

("Drammatico e dolcissimo","Un uomo ossessionato dalla autorevolezza dittatoriale della madre,decide di vivere una vita semplice,ad un certo punto della vita riceve un dono,la figlia della sorella morta, è l'ultimo desiderio della sorella, lasciarla al fratello significa per lei farla vivere e crescere come una bambina normale,ma la piccola Mary all'età di sei sette anni si rivela una gifted, un genio in matematica così come la madre,essa non può vivere la scuola come gli altri,ma deve vivere la sua infanzia fatta di spensieratezza,e soprattuto confrontarsi con altri bambini.Ritengo questo film una grandissima testimonianza di un problema poco conosciuto,realmente vissuto nel mondo da migliaia di famiglie,la convivenza con un figlio super dotato,anche se la definizione può sembrare odiosa è l'esatta definizione che si può dare,riuscire nel trovare la giusta dimensione non è facile in quanto sia le istituzioni e i media non conoscendo il problema creano un muro di emarginazione sociale verso questi fantastici bambini,che cercano soltanto di vivere la loro vita
","2018-07-06","Alina.aprea2@hotmail.it","Gifted"),
("Deludente","Il film avrebbe dovuto essere incentrato sulla bambina particolarmente dotata, ma l'illusione dura poco. Non vengono quasi per nulla trattate le tematiche legate ai gifted children, al centro rimangono sempre i grandi e i loro grandi problemi. Alla distanza a uscire sono i soliti clichè hollywoodiani, fatti di improbabili relazioni sentimentali tra professoresse e genitori degli alunni, famiglie che si combattono nei tribunali a colpi di arringhe e odi atavici, e tate di colore pacioccose e piene di umanità.
Musiche eccessive e attori poco convincenti completano un film che non ha saputo dare ciò che prometteva.","2018-06-08","Alberto.girotondo@libero.it","Gifted"),

("Thriller psicologico di alta scuola"," Thriller di altissima scuola sfornato da un grandissimo Scorsese che si conferma uno dei migliori registi viventi. Pellicola mai banale e scontata con la quale il maestro italo-americano cerca di colpire lo spettatore con giochi psicologici e ripetuti colpi di scena, tanto da porre un punto interrogativo sul film stesso, il quale si appresta a diverse interpretazioni. Uno dei migliori film del genere; la sua visione e comprensione a 360 gradi necessitano di un attenzione ai particolari maniacale...geniale la regia che per più di un ora prende in giro lo spettatore che vede il tutto con gli occhi della pazzia, tanto da convincerlo a pensare come il pazzo al punto tale che tutto il film viene messo in discussione.
","2017-10-10","Alberto.girotondo@libero.it","Shutter Island"),

("Spettacolare!","Ho atteso con impazienza la visione di questo film perché ero certo che avrei provato delle emozioni fortissime. Non mi ha delus, anzi, mi ha lasciato a bocca aperta. Sono isolano e sono cresciuto andando in barca, ma un'esperienza come quella vissuta dalla protagonista ha che dell'incredibile. Musiche, effetti speciali ed attori: tutto perfetto. Correre al cinema!
","2018-04-01","Alberto.girotondo@libero.it","Resta con me");


  
  
insert into CINEMA values

    ("Movieplex","Mercogliano","18:00:00"),
    ("Duel","Salerno","19:00:00"),
	("Savoia","Napoli","20:00:00");
   
    
    insert into CINEMA_FILM values
	("Movieplex","Tremors"),
	("Movieplex","ToyStory"),
	("Movieplex","Shutter Island"),
    ("Movieplex","Illusionist"),
    ("Movieplex","Resta con me"),
    ("Duel","Tremors"),
    ("Duel","ToyStory"),
    ("Duel","Gifted"),
    ("Duel","Avengers"),
    ("Savoia","Tremors"),
    ("Savoia","ToyStory"),
    ("Savoia","Shutter Island"),
    ("Savoia","Resta con me"),
    ("Savoia","Gifted"),
    ("Savoia","The imitation game");
