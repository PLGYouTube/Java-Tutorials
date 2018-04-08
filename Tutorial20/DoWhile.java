import java.util.Random;

public class DoWhile {
	public static void main(String[] args) {
		// Die While Schleife wird ausgeführt solange die gegebene Bedingung erfüllt ist
		/*
		 * while (Bedingung) {
		 * 	   Code;
		 * }
		 */
		// Bei der do While Schleife wird der Code immer einmal zum Anfang ausgeführt und danach verhält es
		// sich wie eine normale while Schleife
		
		Random wuerfel = new Random();
		Integer ergebnis = null;
		
		do {
			// Würfelwurf (Zahlen 1-6)
			ergebnis = wuerfel.nextInt(6) + 1;
			System.out.println(ergebnis);
		} while (ergebnis != 6);
	}
}
