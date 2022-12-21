package ch.zhaw.springboot.entities;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Lecture {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private String topic;
  private long date;
 
  @ManyToMany
  private ArrayList<Student> students = new ArrayList<Student>();

  @ManyToMany
  private ArrayList<Language> languages = new ArrayList<Language>();

  public Lecture(String name, String topic, long date, ArrayList<Language> languages, ArrayList<Student> students) {
    this.name = name;
    this.topic = topic;
    this.date = date;
    this.languages = languages;
    this.students = students;
  }

  public Lecture() {}

  public String getName() {
    return this.name;
  }

  public String getTopic() {
    return this.topic;
  }

  public long getDate() {
    return this.date;
  }

  @JsonIgnore
  public ArrayList<Language> getLanguages() {
    return this.languages;
  }

  public void addLanguage(Language language) {
    languages.add(language);
  }

  @JsonIgnore
  public ArrayList<Student> getStudents() {
    return this.students;
  }

  public void addStudent(Student student) {
    students.add(student);
  }
}
