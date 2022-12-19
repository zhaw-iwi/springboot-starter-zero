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
  private Language language;

  public Lecture(String name, String topic, long date, Student student, Language language) {
    this.name = name;
    this.topic = topic;
    this.date = date;
    this.student = student;
    this.language = language;
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

  public Language getLanguage(){
    return this.language;
  }
}
