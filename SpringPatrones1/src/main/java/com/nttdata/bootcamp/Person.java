package com.nttdata.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Cloneable{
	private String name;
	private int age;
	static Person person;

	public static Person getPerson(String name, int age) {
		return new Person(name, age);
	}
}
