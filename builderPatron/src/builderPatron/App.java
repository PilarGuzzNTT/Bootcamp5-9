package builderPatron;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person.Builder().name("Pilar").age(27).build();

		Person person2 = new Person.Builder().name("Pepin").age(25).build();

		Person person3 = new Person.Builder().age(5).build();
		

		System.out.println(person1.getName() + " " + person1.getAge());
		System.out.println(person2.getName() + " " + person2.getAge());
		System.out.println(person3.getName() + " " + person3.getAge());

	}

}
