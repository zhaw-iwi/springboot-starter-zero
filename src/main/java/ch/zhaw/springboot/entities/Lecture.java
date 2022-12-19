package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lecture {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private String topic;
  private long date;

  @ManyToMany
  private Student student;

  public Class(String name, String topic, long date, Student student) {
    this.name = name;
    this.topic = topic;
    this.date = date;
    this.student = student;
  }

  public Class() {}

  public String getName() {
    return this.name;
  }

  public String getTopic() {
    return this.topic;
  }

  public long getDate() {
    return this.date;
  }

  public Friend getFriend() {
    return this.friend;
  }
}
