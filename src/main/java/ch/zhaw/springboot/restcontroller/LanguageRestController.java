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

@RestController
public class LanguageRestController {
	@Autowired
	private LanguageRepository repository;

	@RequestMapping(value = "lectures/languages", method = RequestMethod.GET)
	public ResponseEntity<List<Language>> getLanguages() {
		List<Language> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Language>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Language>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "lectures/languages/{origin}", method = RequestMethod.GET)
	public ResponseEntity<List<Language>> getLanguageByOrigin(@PathVariable("origin") String origin) {
		List<Language> result = this.repository.findLanguagesByOrigin(origin);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Language>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Language>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "lectures/languages/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<Language>> getLanguageByName(@PathVariable("name") String name) {
		List<Language> result = this.repository.findLanguagesByName(name);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Language>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Language>>(HttpStatus.NOT_FOUND);
		}
	}
}
