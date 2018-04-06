public class InterfacesTutorial {
	public static void main(String[] args) {
		Auto a = new Auto();
		Fahrrad f = new Fahrrad();
		
		a.fahreLos();
		f.fahreLos();
		a.bremse();
		f.bremse();
		
		// Gemeinsamkeiten zwischen Klasse und Interface
		// - Ein Interface kann endlos viele Methoden enthalten
		
		// Unterschiede
		// - Ein Interface kann nicht instanziiert werden, also niemals ein Objekt sein
		// - Ein Interface besitzt keinen Konstruktor
		// - Alle Methoden in einem Interface sind abstrakt und public
		// - Eine Klasse kann lediglich eine (nicht abstrakte) Klasse erben aber mehrere Interfaces implementieren.
	}
}