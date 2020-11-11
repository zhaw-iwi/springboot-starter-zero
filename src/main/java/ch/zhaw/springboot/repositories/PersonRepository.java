package ch.zhaw.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.zhaw.springboot.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	@Query("SELECT pe FROM Person pe WHERE pe.birthdate = ?1")
	public List<Person> findPersonsByBirthdate(long birthdate);
}
