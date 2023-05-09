package builderPatron;

public class Person {
	
	private String name;
	private int age;
	
	
	private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//-----------BUILDER-----------------
    public static class Builder {
    	private String name;
    	private int age;
    	
    	public Builder name(String name) {
    		this.name = name;
    		return this;
    	}
    	
    	public Builder age(int age) {
    		this.age = age;
    		return this;
    	}
    	
    	public Person build() {
    		return new Person(this);
    	}
    }
}
