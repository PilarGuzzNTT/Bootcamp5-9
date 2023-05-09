package proxyPatron;

public class App {

	public static void main(String[] args) {
		PersonI pp = new PersonProxy("Pepe", 24);
		PersonI sal = new PersonaSaluda(pp);
		
		sal.saludo();
		pp.saludo();

	}

}
