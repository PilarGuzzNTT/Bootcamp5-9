package proxyPatron;

public class PersonProxy implements PersonI {
	private String name;
	private int age;
	private PersonaSaluda saluda;
		
	public PersonProxy() {}
	

	public PersonProxy(String name, int age) {
		this.name = name;
		this.age = age;
		this.saluda = new PersonaSaluda();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public void before() {
		System.out.println("*Te encuenras a alguien*");
	}
	
	public void after() {
		System.out.println("*Os dais la mano*");
	}
	
	@Override
	public String saludo() {
		before();
		String saluda = this.saluda.saludo();
		System.out.println(saluda);
		after();
		return null;
	}

}
