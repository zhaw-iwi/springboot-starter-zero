package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private long birthdate;

	public Person(String name, long birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public Person() {

	}

	public String getName() {
		return this.name;
	}

	public long getBirthdate() {
		return this.birthdate;
	}
}
