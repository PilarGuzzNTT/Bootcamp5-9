package com.nttdata.bootcamp;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pruebas {
	
	@Autowired
	@Qualifier("SingletonPerson")
	private Person singletonPerson;

	@Autowired
	@Qualifier("PrototypePerson")
	private Person prototypePerson;
	
	@PostConstruct
	public void init() {
		System.out.println(singletonPerson);
		System.out.println(prototypePerson);
	}

}
