public abstract class Tier {
	private int xKoordinate = 0;
	private int yKoordinate = 0;
	
	public void essen(String mahlzeit) {
		System.out.println("Das Tier ist " + mahlzeit);
	}
	
	public void bewege(int xKoordinate, int yKoordinate) {
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		System.out.println(this.xKoordinate + this.yKoordinate);
	}
	
	public abstract void geraeusch();
}
