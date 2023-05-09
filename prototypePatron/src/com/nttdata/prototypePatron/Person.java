package com.nttdata.prototypePatron;


public class Person implements Cloneable {
	
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {}
	
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
	

	@Override
	protected Person clone() throws CloneNotSupportedException {
		return (Person)super.clone();
	}
}
