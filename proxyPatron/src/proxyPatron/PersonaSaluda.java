package proxyPatron;


public class PersonaSaluda implements PersonI {
	
	 private  PersonI personI;
	 
	 

	public PersonaSaluda() {

	}



	public PersonaSaluda(PersonI personI) {
		super();
		this.personI = personI;
	}



	@Override
	public String saludo() {
		return "Hola, esto funciona";
	}

}
