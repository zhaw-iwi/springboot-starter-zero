package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Lecture;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LectureRepository extends JpaRepository<Lecture, Long> {

  @Query("SELECT le FROM Lecture le WHERE le.name = ?1")
  public List<Lecture> findLecturesByName(String name);
}
