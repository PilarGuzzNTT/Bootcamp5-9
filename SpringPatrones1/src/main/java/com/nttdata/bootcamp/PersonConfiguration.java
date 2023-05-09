package com.nttdata.bootcamp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.nttdata.bootcamp")
public class PersonConfiguration {

	@Bean("SingletonPerson")
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Person singletonPerson() {
		return Person.getPerson("Pepi", 30);
	}

	@Bean("PrototypePerson")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Person prototypePerson() {
		return Person.getPerson("Juan", 25);
	}

}
