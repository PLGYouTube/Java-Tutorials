public class VariablenUndDatentypen {
	public static void main(String[] args) {
		/*
		 * In diesem Tutorial wird erklärt, was Variablen sind, einige Datentypen werden erläutert
		 * und if-Anweisungen werden ebenfalls angesprochen und erklärt
		 */
		
		// Eine Variable ist also folgendermaßen aufgebaut:
		// Datentypen Bezeichner = Wert;
		
		// String speichert eine Zeichenkette in Anführungsstrichen also ""
		String name = "Ibrahim";
		
		// int Ganzzahlen speichert
		int alter = 22;
		
		// boolean true (wahr) oder false (falsch)
		boolean kannProgrammieren = false;
		
		System.out.print("Hi, mein Name ist " + name + ", ich bin " + alter + " Jahre alt...");
		
		if (kannProgrammieren == true) {
			System.out.print(" und ich kann programmieren!");
		} else if (kannProgrammieren == false) {
			System.out.print(" und ich muss noch ein paar PLG-Tutorials schauen! :)");
		}
	}
}
