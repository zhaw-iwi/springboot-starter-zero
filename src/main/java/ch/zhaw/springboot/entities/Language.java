package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Language {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private String origin;

  @ManyToMany
  private Lecture lecture;

  public Lecture(String name, String origin, Lecture lecture) {
    this.name = name;
    this.topic = topic;
    this.date = date;
    this.lecture = lecture;
  }

  public Class() {}

  public String getName() {
    return this.name;
  }

  public String getOrigin() {
    return this.origin;
  }

  public Lecture getLecture() {
    return this.lecture;
  }
}
