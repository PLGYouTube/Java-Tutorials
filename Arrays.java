public class Arrays {
	public static void main(String[] args) {
		// Datentypen[] bezeichner;
		// Datentypen[] bezeichner = new Datentypen[] {wert0, wert1, wert2};
		// Datentypen[] bezeichner = new Datentypen[5];
		
		/*
		 * 0. Milch
		 * 1. Wurst
		 * 2. Bier
		 * 3. Mett
		 * 4. Wasser
		 * 5. Zeitschrift
		 * 6. Eis
		 */
		String[] einkaufsliste;
		einkaufsliste = new String[7];
		
		einkaufsliste[0] = "Milch";
		einkaufsliste[1] = "Wurst";
		einkaufsliste[2] = "Bier";
		einkaufsliste[3] = "Mett";
		einkaufsliste[4] = "Wasser";
		einkaufsliste[5] = "Zeitschrift";
		einkaufsliste[6] = "Eis";
		
		System.out.println("Die Einkaufsliste hat " + einkaufsliste.length + " Elemente.");
		
		for (int i = 0; i < einkaufsliste.length; i++) {
			System.out.println(einkaufsliste[i]);
		}
	}
}
