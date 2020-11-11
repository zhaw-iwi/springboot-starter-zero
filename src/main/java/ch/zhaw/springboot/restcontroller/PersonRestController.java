package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Person;
import ch.zhaw.springboot.repositories.PersonRepository;

@RestController
public class PersonRestController {
	@Autowired
	private PersonRepository repository;

	@RequestMapping(value = "infections/persons", method = RequestMethod.GET)
	public ResponseEntity<List<Person>> getPersons() {
		List<Person> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Person>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Person>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "infections/persons/{birthdate}", method = RequestMethod.GET)
	public ResponseEntity<List<Person>> getPersonsByBirthdate(@PathVariable("birthdate") long birthdate) {
		List<Person> result = this.repository.findPersonsByBirthdate(birthdate);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Person>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Person>>(HttpStatus.NOT_FOUND);
		}
	}
}
