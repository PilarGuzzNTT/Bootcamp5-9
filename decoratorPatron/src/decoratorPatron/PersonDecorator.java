package decoratorPatron;

public class PersonDecorator implements PersonInterface {
	
	 private final PersonInterface personInterface;
	 private final int altura;
	 
	 public PersonDecorator(PersonInterface personInterface, int altura) {
	        this.personInterface = personInterface;
	        this.altura = altura;
	    }

	@Override
	public String getName() {
		return personInterface.getName();
	}

	@Override
	public int getAge() {
		return personInterface.getAge();
	}

	@Override
	public String saludo() {
		return personInterface.saludo() + "mido " + altura;
	}

}
