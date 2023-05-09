package facadePatron;

import java.util.List;

public class App {

	public static void main(String[] args) {
		PersonFacade facade = new PersonFacade();
        List<Person> persons = facade.buildList();

        for (Person person : persons) {
            System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
        }
	}

}
