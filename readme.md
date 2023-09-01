# set & map
## Theoretische Fragen
1. Gebt ein Beispiel für eine Situation, in der die Verwendung eines Sets sinnvoller wäre als die Verwendung einer ArrayList. Erklärt eure Entscheidung.
2. Gebt ein Beispiel für eine Situation, in der die Verwendung einer Map sinnvoller wäre als die Verwendung einer ArrayList oder eines Sets. Erklärt eure Entscheidung.
3. Nenne eine weitere Klasse auf dem 'Java Collections Framework', neben 'ArrayList', 'HashSet' und 'HashMap'.

## Aufgaben
### Aufgabe 1
1. Schritt 1: Baut eure Applikation aus dem List-Vortrag von ArrayList in HashMap um.

### Aufgabe 2
1. _Schritt 1_: Erstellt eine Klasse 'medicine' mit den Methoden 'getName', 'getPrice' und 'getAvailability'.
2. _Schritt 2_: Lege eine Java-Klasse 'Apotheke' an, die eine Java-Map verwendet, um den Medication Namen als Schlüssel und deren Informationen als Werte zu speichern. Implementiere Methoden, um Medication zur Map hinzuzufügen, Informationen abzurufen und die Verfügbarkeit zu aktualisieren.
3. _Schritt 3_: Lege eine Methode 'int getCount()' in der Klasse `Apotheke` an. Diese Methode sollte die Anzahl der Medication in der Apotheke zurückgeben.
4. _Schritt 4_: Lege eine Methode 'void save(Medication medication)' in der Klasse `Apotheke` an. Diese Methode sollte das Medication indexiert nach seinem Namen in die Apotheke einfügen.
5. _Schritt 5_: Lege eine Methode 'Medication find(String medicationName)' in der Klasse `Apotheke` an. Diese Methode sollte die gesuchte Medication mit diesem Namen zurückgeben. Falls keine Medication mit diesem Namen gefunden wird, sollte die Methode null zurückgeben.
6. _Schritt 6_: Lege eine Methode 'void delete(String medicationName)' in der Klasse `Apotheke` an. Diese Methode sollte die Medication mit diesem Namen löschen.
7. _Schritt 7_: Implementiere eine Methode, um alle Medication in der Map auszugeben, einschließlich ihres Namens, Preises und der Verfügbarkeit._
