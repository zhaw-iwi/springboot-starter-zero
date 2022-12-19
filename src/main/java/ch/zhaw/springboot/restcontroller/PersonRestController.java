package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Language;
import ch.zhaw.springboot.repositories.LanguageRepository;
import ch.zhaw.springboot.entities.Student;
import ch.zhaw.springboot.repositories.StudentRepository;
import ch.zhaw.springboot.entities.Lecture;
import ch.zhaw.springboot.repositories.LectureRepository;

@RestController
public class PersonRestController {
	@Autowired
	private LanguageRepository repository;

	@RequestMapping(value = "infections/persons", method = RequestMethod.GET)
	public ResponseEntity<List<Language>> getPersons() {
		List<Language> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Language>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Language>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "infections/persons/{birthdate}", method = RequestMethod.GET)
	public ResponseEntity<List<Language>> getPersonsByBirthdate(@PathVariable("origin") String origin) {
		List<Language> result = this.repository.findLanguagesByOrigin(origin);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Language>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Language>>(HttpStatus.NOT_FOUND);
		}
	}
}
