import foo.BeispielZwei;

public class Zugriffsmodifikatoren {
	private int privateVariable = 5;
	
	public static void main(String[] args) {
		// public, protected und private sind Zugriffsmodifikatoren

		/*
		 * Modifikator	Klasse	Paket	Unterklasse	 Jeder
		 * public         J       J         J           J
		 * protected      J       J         J           N
		 * (default)      J       J         N           N
		 * private        J       N         N           N
		 * 
		 */
		
		// Faustregel: Wenn du nicht weißt, welcher Zugriffsmodifikator der Beste ist, setze ihn auf private.

		Beispiel b = new Beispiel();
		b.gebeWertAus();
		
		BeispielZwei b2 = new BeispielZwei();
		b2.setIrgendeineVariable(100);
		System.out.println(b2.getIrgendeineVariable());
	}
	
	private void addiereVariable() {
		privateVariable += 5;
	}
}
