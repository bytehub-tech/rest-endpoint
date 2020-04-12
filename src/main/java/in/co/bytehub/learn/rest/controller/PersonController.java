package in.co.bytehub.learn.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.co.bytehub.learn.rest.controller.model.Person;
import in.co.bytehub.learn.rest.controller.service.PersonService;

@RestController
public class PersonController {

	private PersonService service;

	public PersonController(PersonService service) {
		this.service = service;
	}

	@GetMapping("/person")
	public List<Person> getAllPerson() {
		System.out.println("GET: /person called");
		return service.getAllPerson();
	}

	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable("id") Integer personId) {
		System.out.println("GET: /person/{id} called");
		return service.getPerson(personId);
	}

	@PostMapping("/person")
	public void createPerson(@RequestBody Person person) {
		System.out.println("POST: /person called");
		service.savePerson(person);
	}

	@PutMapping("/person/{id}")
	public void updatePerson(@PathVariable("id") Integer personid, @RequestBody Person person) {
		System.out.println("PUT: /person/{id} called");
		service.updatePerson(personid, person);
	}

	@DeleteMapping("/person/{id}")
	public void deletePerson(@PathVariable("id") Integer personId) {
		System.out.println("DELETE: /person/{id} called");
		service.deletePerson(personId);
	}
}
