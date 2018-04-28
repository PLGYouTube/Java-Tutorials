interface MachWas {
	void machen();
}

class Macher {
	public void machtIrgendwas(MachWas mw) {
		mw.machen();
	}
}

public class LambdaTutorial {

	public static void main(String[] args) {
		// Ein Lambda ist eine Funktion ohne Bezeichner.
		// Ein Lambda kann als Parameter übergeben.
		// Ein Lambda kann die Funktion eines funktionalen Interfaces überschreiben.
		// Was ist ein funktionales Interface?
		// Ein funktionales Interface, ist ein Interface mit lediglich EINER Funktion.
		
		Macher m1 = new Macher();
		MachWas mw = new MachWas() {
			@Override
			public void machen() {
				System.out.println("Das ist aber blöd");
			}	
		};
		m1.machtIrgendwas(mw);
		
		Macher m2 = new Macher();
		// Aufbau eines Lambdas: (param1, param2, ...) -> { Code }
		m2.machtIrgendwas( () -> System.out.println("Das sieht doch viel schöner aus"));
	}
}
