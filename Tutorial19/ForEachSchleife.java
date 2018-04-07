public class ForEachSchleife {

	public static void main(String[] args) {
		String[] fruechte = {"Apfel", "Birne", "Banane", "Orange"};
		
		for (int i = 0; i < 5; i++) {
			System.out.println(fruechte[i]);
		}
		
		// Die forEach Loop sagt prinzipiell "arbeite jedes Element aus dieser Liste ab"
		// Eine forEach Loop ist so aufgebaut:
		// Linke Seite das Element, dann folgt ein : und die Liste über die iteriert werden soll.
		// Man kann den Doppelpunkt so lesen "für jedes Element f aus fruechte"
		for (String f : fruechte) {
			System.out.println(f);
		}
		
	}

}
