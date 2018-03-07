public class SwitchStatement {

	public static void main(String[] args) {
		int schulnote = 10;
		
		switch (schulnote) {
			case 1:
				System.out.println("Sehr gut");
				break;
			case 2:
				System.out.println("Gut");
				break;
			case 3:
				System.out.println("Befriedigend");
				break;
			case 4:
				System.out.println("Ausreichend");
				break;
			case 5:
				System.out.println("Mangelhaft");
				break;
			case 6:
				System.out.println("Ungenügend");
				break;
			default:
				System.out.println("Es handelt sich hierbei um eine ungültige Schulnote");
		}
		
		// Beispiel mit Fall-Through
		switch (schulnote) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Bestanden");
				break;
			case 5:
			case 6:
				System.out.println("Nicht bestanden");
				break;
			default:
				System.out.println("Es handelt sich hierbei um eine ungültige Schulnote");
		}
		
		String schulnoteAusgeschrieben = "Gut";
		
		switch (schulnoteAusgeschrieben) {
			case "Sehr gut":
				System.out.println(1);
				break;
			case "Gut":
				System.out.println(2);
				break;
			case "Befriedigend":
				System.out.println(3);
				break;
			case "Ausreichend":
				System.out.println();
				break;
			case "Mangelhaft":
				System.out.println();
				break;
			case "Ungenügend":
				System.out.println(6);
				break;
			default:
				System.out.println("Es handelt sich hierbei um eine ungültige Schulnote");
		}		
	}
}
