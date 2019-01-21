create schema progettoIS;
use progettoIS;

CREATE TABLE UTENTE (
	Email varchar(30) primary key,
    Username varchar(30),
    Password varchar(20),
    Ruolo varchar(20)
    
    );
    
         
CREATE TABLE FILM (
	TitoloFilm varchar(30) primary key,
    Trama varchar(1500),
    Locandina varchar(40),
    Categoria varchar(20),
    email varchar(30),
    
    foreign key(Email) references UTENTE(Email)
    on delete set null on update cascade
    
    );
      
    
    
CREATE TABLE RECENSIONE (
	Titolo varchar(50) primary key,
    Testo varchar(1500),
    Data date,
    email varchar(30),
    titoloFilm varchar(30),

    foreign key(Email) references UTENTE(Email)
    on delete set null on update cascade
    );
	    


CREATE TABLE CINEMA (
	Nome varchar(20) primary key,
    Luogo varchar(20),
    Orario time

    );
    
    
    
  
 CREATE TABLE CINEMA_FILM  (
	Nome varchar(20) ,
    TitoloFilm varchar (30),
    primary key(Nome,TitoloFilm),
    foreign key(Nome) references CINEMA(Nome),
    foreign key(TitoloFilm) references FILM(TitoloFilm)
    on delete cascade on update cascade
    );
    
    
    