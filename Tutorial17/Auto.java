public class Auto implements Fahrzeug {

	@Override
	public void fahreLos() {
		System.out.println("Drücke auf das Gaspedal");
	}

	@Override
	public void bremse() {
		System.out.println("Drücke auf die Bremse");
	}
}