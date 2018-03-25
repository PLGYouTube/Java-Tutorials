import java.util.ArrayList;

public class ArrayListTutorial {
	public static void main(String[] args) {
		// Eine ArrayList ist eine Klasse
		// Die ArrayList ist beliebt aus dem Grund, dass sie keine fixe Länge hat und allerlei tolle Funktionen hat
		// Die Länge passt sich also sozusagen an die Anzahl der Elemente an
		// Eine ArrayList hat immer einen bestimmten Datentypen
		// Dieser Datentyp muss immer ein Objekt sein und kann kein primitiver Datentyp sein, wie zB int oder char
		
		ArrayList<String> studenten = new ArrayList<String>();
		
		// add()
		studenten.add("Ibrahim");
		studenten.add("Nicolle");
		studenten.add("Lisa");
		studenten.add("Thomas");
		studenten.add("Kim");
		
		System.out.println(studenten);
		
		// remove()
		studenten.remove(0);
		studenten.remove("Lisa");
		
		System.out.println(studenten);
		
		// set(index, neuen Wert)
		studenten.set(1, "Tomas");
		
		System.out.println(studenten);
		
		// get()
		System.out.println(studenten.get(0));
		
		// size()
		System.out.println(studenten.size());
		
		for (int i = 0; i < studenten.size(); i++) {
			System.out.println(studenten.get(i));
		}
		
		// contains()
		System.out.println(studenten.contains("Nicolle"));
		System.out.println(studenten.contains("Ibrahim"));
		
		// clear()
		studenten.clear();
		
		System.out.println(studenten);
	}
}
