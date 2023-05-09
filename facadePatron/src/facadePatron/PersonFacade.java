package facadePatron;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFacade {
	
    private final List<Person> personList;

    public PersonFacade() {
    	personList = new ArrayList<>();
    	personList.add(new Person("Pilar", 25));
    	personList.add(new Person("María", 27));
    	personList.add(new Person("Pepin", 22));
    	personList.add(new Person("Tomas", 33));
    	personList.add(new Person("Luisa", 30));
    	personList.add(new Person("Manolo", 21));
    	personList.add(new Person("Dudi", 18));
    }
    
    public List<Person> buildList() {
  
        return personList.stream()
                .filter(person -> person.getAge() >= 20 && person.getAge() <= 30)
                .collect(Collectors.toList());
    }
}
