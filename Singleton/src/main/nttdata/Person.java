package main.nttdata;

public class Person {
	
	private String name;
	private int age;
	
	private static Person instance = null;
	
	public Person() {}
	
	private Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	
	public static Person getInstance() { 
        if (instance == null) {
            instance = new Person("Pilar", 27); 
        }
        return instance;
    }
	
	

}
