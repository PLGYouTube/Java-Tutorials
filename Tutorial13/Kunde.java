public class Kunde extends Person {
	private int geld;
	
	public Kunde(int alter, String name, int groesse, int geld) {
		super(alter, name, groesse);
		this.geld = geld;
	}
	
	public void gebeGeldAus(int betrag) {
		geld -= betrag;
	}
	
	public void zeigeGeldBestand() {
		System.out.println(geld);
	}
}
