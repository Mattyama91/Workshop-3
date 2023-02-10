# Workshop-3
Projektem jest aplikacja oparty na servletach, dzięki której będziemy mogli tworzyć, modyfikować i usuwać użytkowników.

Aplikacja posiada następujące funkcje:

* wyświetlanie wszystkich użytkowników,
* dodanie użytkownika,
* edycja danych użytkownika,
* usuwanie użytkownika,
* wyświetlanie pojedynczego użytkownika.

Do projektu wykorzystany został gotowy szablon o nazwie SB Admin 2 zawierający html oraz css.
Więcej na temat tego szablonu znajdziemy na stronie twórców:
https://startbootstrap.com/themes/sb-admin-2/

Szablon ten korzysta z biblioteki css:
https://getbootstrap.com/



Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki.

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`.

Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".

Zwróć uwagę, żeby użyć adresu własnego forka, powinien wyglądać zgodnie ze schematem:
`https://github.com/twoj-login/adres_repozytorium`


3. Zaimportuj projekt jako projekt `Maven`, wg poniższych wskazówek:

	* W `IntelliJ` wybieramy: `File –> New –> Project from Existing Sources...`
	* Wskazujemy lokalizację katalogu ze sklonowanym projektem i zatwierdzamy.
	* Następnie w nowym oknie wybieramy: `Import project from external model` i wskazujemy `Maven`
	* Wybieramy opcję: ` Finish`, (w `IntelliJ` przed 2020: `Next –> Next –> Next –> Finish`);

4. W pliku pom.xml dodaj zaleźności do
	* sterownika bazy danych:
	* JBcrypt:
	
5. Podstawą do naszych dalszych działań jest baza danych. Przygotuj bazę danych o nazwie workshop2 według zapytania:
	`CREATE DATABASE workshop2 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;`

6. Kolejnym krokiem jest utworzenie tabeli users według poniższego zapytani:
	`CREATE TABLE users`
	`(`
    		`id INT(11) AUTO_INCREMENT,`
    		`email VARCHAR(255) UNICODE DEFAULT NULL,`
    		`username VARCHAR(255) DEFAULT NULL,`
    		`password VARCHAR(60) DEFAULT NULL,`
    		`PRIMARY KEY (id)`
	`);`
7. Uzupełnić plik pom.xml o wpisy:
   `<packaging>war</packaging>`
   `<properties>`
   `<maven.compiler.source>11</maven.compiler.source>`
   `<maven.compiler.target>11</maven.compiler.target>`
   `</properties>`
8. Utwórz tag:
   `<dependencies></dependencies>`
   Dodać w nim zależności odpowiedzialne za servlety oraz jstl:
   `<dependency>`
   `<groupId>javax.servlet</groupId>`
   `<artifactId>javax.servlet-api</artifactId>`
   `<version>4.0.1</version>`
   `<scope>provided</scope>`
   `</dependency>`
   `<dependency>`
   `<groupId>javax.servlet</groupId>`
   `<artifactId>jstl</artifactId>`
   `<version>1.2</version>`
   `</dependency>`
9. Dodać również zależności dla sterownika mysql oraz jbcrypt:
   `<dependency>`
   `<groupId>org.mindrot</groupId>`
   `<artifactId>jbcrypt</artifactId>`
   `<version>0.4</version>`
   `</dependency>`
   `<dependency>`
   `<groupId>mysql</groupId>`
   `<artifactId>mysql-connector-java</artifactId>`
   `<version>8.0.20</version>`
   `</dependency>`
