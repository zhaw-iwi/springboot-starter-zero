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

  public Language(String name, String origin) {
    this.name = name;
    this.origin = origin;
  }

  public Language() {}

  public String getName() {
    return this.name;
  }

  public String getOrigin() {
    return this.origin;
  }

}
