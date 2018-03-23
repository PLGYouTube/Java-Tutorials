public class Vererbung {
	public static void main(String[] args) {
		// Merke: Private Attribute werden vererbt sind aber nicht zugreifbar in der Unterklasse
		// Merke: Private Methoden werden ebenfalls nicht vererbt
		
		Mitarbeiter markus = new Mitarbeiter(30, "Markus", 185, 1);
		markus.beschreibePerson();
		markus.arbeiten();
		markus.atme();
		
		Person kim = new Person(14, "Kim", 170);
		kim.beschreibePerson();
		
		Kunde tobias = new Kunde(25, "Tobias", 178, 1000);
		tobias.gebeGeldAus(40);
		tobias.zeigeGeldBestand();
	}
}
