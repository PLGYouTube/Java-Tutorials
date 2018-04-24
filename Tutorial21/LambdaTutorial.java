public class LambdaTutorial {
	public static void main(String[] args) {
		// Lambda-Ausdrücke sind anonyme Methoden, also Methoden ohne Namen
		// Sie werden benutzt um eine Methode eines funktionalen Interfaces zu implementieren
		// Frage: Was ist denn ein funktionales Interface?
		// Ein funktionales Interface, ist ein Interface, welches lediglich eine (abstrakte) Methode besitzt.
		
		// 6 Zeilen Code
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Das herkömmliche Vorgehen.");
			}
		};
		
		// Aufbau eines Lambda-Ausdrucks: (param1, param2, ...) -> { Funktionalität }
		// 1 Zeile Code
		Runnable r2 = () -> System.out.println("Neues Vorgehen mit Lambda-Ausdrücken.");
		
		r1.run();
		r2.run();
	}
}
