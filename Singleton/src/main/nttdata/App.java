package main.nttdata;

public class App {

	public static void main(String[] args) {
		
		
		Person person1 = Person.getInstance();
        Person person2 = Person.getInstance();
        
        System.out.println(person1);
        System.out.println(person1.getName() + " " + person1.getAge()); 

        person1.setName("Pepe");
        person1.setAge(18);

        System.out.println(person1);
        System.out.println(person1.getName() + " " + person1.getAge()); 

        System.out.println(person2.getName() + " " + person2.getAge()); 
        System.out.println(person2);


	}

}
