public class Person {
	private int alter;
	private String name;
	private int groesse;
	
	public Person(int alter, String name, int groesse) {
		this.alter = alter;
		this.name = name;
		this.groesse = groesse;
	}
	
	public void atme() {
		System.out.println("Ich atme");
	}
	
	public void essen() {
		System.out.println("Ich esse");
	}
	
	public void beschreibePerson() {
		foo();
	}
	
	private void foo() {
		System.out.println("Ich bin " + alter + " Jahre alt, heiße " + name + " und bin " + groesse + " cm groß");
	}
}
