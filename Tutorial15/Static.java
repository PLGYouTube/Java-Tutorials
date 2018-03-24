public class Static {

	public static void main(String[] args) {
		Student ibo = new Student("ibo", 123);
		System.out.println(ibo.anzahlDerStudenten);
		Student franz = new Student("franz", 321);
		System.out.println(ibo.anzahlDerStudenten);
		
		Student.studiere();
	}

}
