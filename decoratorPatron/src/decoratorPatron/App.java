package decoratorPatron;

public class App {

	public static void main(String[] args) {
		PersonInterface persona = new Person("Juan", 30);
        System.out.println(persona.saludo()); 

        PersonInterface personaConAltura = new PersonDecorator(persona, 170);
        System.out.println(personaConAltura.saludo()); 
    }
	

}
