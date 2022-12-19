package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Lecture;
import ch.zhaw.springboot.repositories.LectureRepository;

@RestController
public class LectureRestController {
	@Autowired
	private LectureRepository repository;

	@RequestMapping(value = "lectures/lectures", method = RequestMethod.GET)
	public ResponseEntity<List<Lecture>> getLectures() {
		List<Lecture> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Lecture>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Lecture>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "lectures/lectures/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<Lecture>> getLectureByName(@PathVariable("name") String name) {
		List<Lecture> result = this.repository.findLecturesByName(name);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Lecture>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Lecture>>(HttpStatus.NOT_FOUND);
		}
	}
}
