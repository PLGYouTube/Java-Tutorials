public class IfUndVergleichsoperatoren {
	public static void main(String[] args) {
		int ersteZahl;
		int zweiteZahl;
		
		ersteZahl = 4;
		zweiteZahl = 4;
		
		// >= oder >
		if (ersteZahl > zweiteZahl) {
			System.out.println(ersteZahl + " ist größer als " + zweiteZahl);
		} else if (ersteZahl >= zweiteZahl) {
			System.out.println(ersteZahl + " ist größer gleich " + zweiteZahl);
		}
		
		// !=
		if (ersteZahl != zweiteZahl) {
			System.out.print(ersteZahl + " ist nicht gleich " + zweiteZahl);
		} else {
			System.out.print(ersteZahl + " gleich " + zweiteZahl);
		}
		
		// <= oder <
	}
}
