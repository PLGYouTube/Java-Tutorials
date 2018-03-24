public class Student {
	private String name;
	private int matrikelnummer;
	// static heißt bei Variablen, dass sie der jeweiligen Klasse anstatt einem bestimmten Klassenobjekt angehören
	static public int anzahlDerStudenten = 0;
	
	Student(String name, int matrikelnummer) {
		this.name = name;
		this.matrikelnummer = matrikelnummer;
		anzahlDerStudenten++;
	}
	
	// Bei Methoden sorgt static dafür, dass die Methoden einer Klasse aufgerufen werden können ohne erst instanziiert zu werden
	// Sie sind also ebenfalls nicht an ein Objekt, sondern an eine Klasse gebunden.
	static public void studiere() {
		System.out.println(anzahlDerStudenten);
	}
}
