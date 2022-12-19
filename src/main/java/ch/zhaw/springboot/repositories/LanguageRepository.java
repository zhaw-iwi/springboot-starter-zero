package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LanguageRepository extends JpaRepository<Person, Long> {
  // test

  @Query("SELECT la FROM Language la WHERE la.origin = ?1")
  public List<Person> findLanguagesByOrigin(String origin);
}
