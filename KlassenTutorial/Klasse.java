public class Klasse {
	public static void main(String[] args) {
		Auto autoEins = new Auto("blau", 300, 2);
		Auto autoZwei = new Auto();
		
		autoEins.gebeEigenschaftenAus();
		autoZwei.gebeEigenschaftenAus();
	}
}
