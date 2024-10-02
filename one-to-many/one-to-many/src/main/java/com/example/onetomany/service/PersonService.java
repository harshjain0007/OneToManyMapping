package com.example.onetomany.service;

import com.example.onetomany.model.MobileNumber;
import com.example.onetomany.model.Person;
import com.example.onetomany.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // changing anything
public class PersonService {
	@Autowired
	private PersonRepository personRepository; // Service layer internally using Autowired

	public Person save(Person person) {
		for (MobileNumber mobileNumber : person.getMobileNumber()) {
			mobileNumber.setPerson(person);
		}
		return personRepository.save(person);
	}

	public Iterable<Person> list() {
		return personRepository.findAll();
	}
}
