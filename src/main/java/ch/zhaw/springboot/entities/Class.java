package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

private String name;
	private String topic;
	private long date;

	public Class(String name, String topic, long date) {
		this.name = name;
		this.topic = topic;
		this.date = date;
	}

	public Class() {

	}

	public String getName() {
		return this.name;
	}

	public String getTopic() {
		return this.topic;
	}

	public long getDate() {
		return this.date;
	}
}
