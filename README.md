# db-projekt #
Dieses Projekt bietet ein Grundgerüst für die Realisierung der Lösung.


## Verwaltung von Medikamenten in Apotheke (konzept) ##

### Kunden:  ###
	-Kundennummer  
	-Name  
	-Vorname  
	-Geburtsdatum  
	-Krankenkassename  

### Medikamente:  ###
	-Name  
	-Hersteller  
	-Pharmazentralnummer  
	-Beschreibung  

Kunden -> kaufen -> Medikamente

### Verkauf:  ###
	-Kunde  
	-Preis  
	-Datum  
	-Medikament  

Für jeden Kunden - Liste mit gekauften Medikamenten

Für jedes Medikament - Liste mit Kunden, die es gekauft haben


## Verwaltung von Medikamenten in Apotheke (relational) ##

### Kunden:  ###
	-Kundennummer (int)  
	-Nachname (varchar(50))  
	-Vorname (varchar(50))  
	-Geburtsdatum (date)  
	-Krankenkassename (varchar(50))  

### Medikamente:  ###
	-Medikamentenname (varchar(50))  
	-Hersteller (varchar(50))  
	-Pharmazentralnummer (int(8))  
	-Beschreibung (text)  

Kunden -> kaufen -> Medikamente

### Verkauf:  ###
	-Kundenname (varchar(50))  
	-PreisIn€ (float)  
	-Datum (date)  
	-Medikamentenname (varchar(50))  
