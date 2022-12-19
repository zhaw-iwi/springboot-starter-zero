package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private long age;

	@ManyToMany
	private Lecture lecture;

	public Student(String name, long age, Lecture lecture) {
		this.name = name;
		this.age = age;
		this.lecture = lecture;
	}

	public Student() {

	}

	public String getName() {
		return this.name;
	}

	public long getAge() {
		return this.age;
	}

	public Lecture getLecture() {
		return this.lecture;
	}
}