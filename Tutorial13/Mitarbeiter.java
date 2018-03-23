public class Mitarbeiter extends Person {
	private int mitarbeiterID;
	
	public Mitarbeiter(int alter, String name, int groesse, int mitarbeiterID) {
		super(alter, name, groesse);
		this.mitarbeiterID = mitarbeiterID;
	}

	public void arbeiten() {
		System.out.println("Ich arbeite");
	}
	
	@Override
	public void atme() {
		super.atme();
		System.out.println("...aber nur ein wenig...");
	}
}
