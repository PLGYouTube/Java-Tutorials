public class Funktion {
	// Monster mit Lebenspunkten
	int lebenspunkte = 10;
	// Helden mit Angriffsschaden
	int angriffsschaden = 2;
	
	public static void main(String[] args) {
		Funktion f = new Funktion();
		
		int lp1 = f.angriff();
		f.gebeLebenspunkteAus(lp1);
		
		int lp2 = f.angriff();
		f.gebeLebenspunkteAus(lp2);
		
		int lp3 = f.angriff();
		f.gebeLebenspunkteAus(lp3);
		
		int lp4 = f.angriff();
		f.gebeLebenspunkteAus(lp4);
		
		int lp5 = f.angriff();
		f.gebeLebenspunkteAus(lp5);
	}
	
	int angriff() {
		lebenspunkte -= angriffsschaden;
		return lebenspunkte;
	}
	
	void gebeLebenspunkteAus(int lp) {
		System.out.println(lp);
		if (lp == 0) {
			System.out.println("Das Monster ist nicht mehr am leben");
		}
	}
	
	/*
	 * Eine Funktionen hat einen Rückgabewert
	 * Dieser Rückgabewert entspricht einem konkreten Datentyp (z.B. String, int, char)
	 * void (Leere)
	 * 
	 * <Rückgabewert> <Bezeichner> () { Code }
	 * int addieren() { 
	 *     int zehn = 10;
	 *     int fuenf = 5;
	 *     int ergebnis = zehn + fuenf;
	 *     return ergebnis;
	 * }
	 * 
	 * void gibAus() {
	 *     System.out.println("Ausgabe");
	 * }
	 */
}
