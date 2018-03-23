import java.util.ArrayList;
import java.util.List;

// Bei Klassen bedeutet final, dass sie nicht erweitert werden darf von einer Unterklasse
final public class Klasse {
	// Bei Variablen sorgt final dafür, dass der Wert der Variable sich nicht verändern darf.
	final int zahl;
	
	// Bei Objektreferenzen wird dafür gesorgt, dass die Referenz sich nicht ändern darf.
	// Das Objekt an sich, darf sich jedoch schon verändern.
	final List<Integer> zahlen = new ArrayList();
	
	Klasse(int zahl) {
		this.zahl = zahl;
	}
	
	// Bei Methoden bedeutet das final Schlüsselwort, dass die Methode von Unterklassen nicht überschrieben werden darf.
	final public void gebeZahlAus() {
		System.out.println("Die Zahl ist final und hat den Wert: " + zahl);
	}
}

