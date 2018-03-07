public class Auto {
	// Eine Klasse hat Klassenvariablen oder auch sog. Eigenschaften
	String farbe;
	int ps;
	int tueren;
	
	Auto() {
		farbe = "weiß";
		ps = 200;
		tueren = 4;
	}
	
	// Eine Klasse hat einen sogenannten Konstruktor. Dabei handelt es sich um eine Funktion, die beim Erstellen eines Klassenobjekts aufgerufen
	Auto(String farbe, int ps, int tueren) {
		this.farbe = farbe;
		this.ps = ps;
		this.tueren = tueren;
	}
	
	void gebeEigenschaftenAus() {
		System.out.println("Das Auto hat folgende Eigenschaften:");
		System.out.println("Farbe: " + farbe);
		System.out.println("PS: " + ps);
		System.out.println("Anzahl der Türen: " + tueren);
	}
}
