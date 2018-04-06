public class AbstrakteKlasseTutorial {
	public static void main(String[] args) {
		Kuh berta = new Kuh();
		Esel ibrahim = new Esel();
		
		berta.bewege(10, 12);
		ibrahim.bewege(500, 23);
		
		berta.essen("Gras");
		ibrahim.essen("Hamburger");
		
		berta.geraeusch();
		ibrahim.geraeusch();
	}
}
