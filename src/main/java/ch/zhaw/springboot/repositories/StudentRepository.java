package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
  // test

  @Query("SELECT stu FROM Student stu WHERE stu.age = ?1")
  public List<Student> findStudentByAge(long age);
}
