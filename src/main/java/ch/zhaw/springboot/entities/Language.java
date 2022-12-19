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
  private Student student;
  private Lecture lecture;

  public Lecture(String name, String origin, Student student, Lecture lecture) {
    this.name = name;
    this.topic = topic;
    this.date = date;
    this.student = student;
    this.lecture = lecture;
  }

  public Class() {}

  public String getName() {
    return this.name;
  }

  public String getOrigin() {
    return this.origin;
  }

  public Friend getStudent() {
    return this.student;
  }

  public Lecture getLecture() {
    return this.lecture;
  }
}
