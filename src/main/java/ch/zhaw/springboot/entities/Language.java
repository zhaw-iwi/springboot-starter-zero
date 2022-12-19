package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Language {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private String origin;

  @ManyToMany
  private Lecture lecture;

  public Language(String name, String origin, Lecture lecture) {
    this.name = name;
    this.origin = origin;
    this.lecture = lecture;
  }

  public Language() {}

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
