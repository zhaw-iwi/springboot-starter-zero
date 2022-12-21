package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Student;
import ch.zhaw.springboot.repositories.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository repository;

	@RequestMapping(value = "lectures/students", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getLectures() {
		List<Student> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Student>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "lectures/students/{age}", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudentByAge(@PathVariable("age") long age) {
		List<Student> result = this.repository.findStudentByAge(age);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Student>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "lectures/students/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable("name") String name) {
		List<Student> result = this.repository.findStudentByName(name);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Student>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
		}
	}
}
