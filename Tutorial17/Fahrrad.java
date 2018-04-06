public class Fahrrad implements Fahrzeug, Foo {

	@Override
	public void fahreLos() {
		System.out.println("Trete in die Pedale");	
	}

	@Override
	public void bremse() {
		System.out.println("Betätige beide Vorderbremsen");
	}

}