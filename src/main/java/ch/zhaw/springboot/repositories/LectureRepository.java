package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LectureRepository extends JpaRepository<Person, Long> {
  // test

  @Query("SELECT le FROM Lecture le WHERE le.name = ?1")
  public List<Person> findLecutresByName(String name);
}
