import java.util.Scanner;

public class Benutzereingabe {
	public static void main(String[] args) {
		/*
		 * Ein Scanner teilt die Benutzereingabe in Wörter mithilfe eines Trennungsmusters.
		 * Standardmäßig werden Wörter durch ein Leerzeichen getrennt.
		 * Die Eingabe "Hallo Welt!" würde also zwei Wörter hergeben, ein Mal Hallo und zum Anderen Welt!
		 */
		Scanner benutzereingabe = new Scanner(System.in);
		
		String vorname;
		String nachname;
		
		System.out.println("Bitte geben Sie Ihren Vornamen ein: ");
		vorname = benutzereingabe.next();
		
		System.out.println("Bitte geben Sie Ihren Nachnamen ein: ");
		nachname = benutzereingabe.next();
		
		System.out.println("Dein Name lautet " + nachname + " und dein Vorname lautet " + vorname);
	}
}
