package in.co.bytehub.learn.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.co.bytehub.learn.rest.controller.model.Person;
import in.co.bytehub.learn.rest.controller.service.PersonService;

@RestController
public class PersonController {

	private PersonService service;
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

	public PersonController(@Qualifier("personServiceFromDB") PersonService service) {
		this.service = service;
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/person")
	public List<Person> getAllPerson() {
		System.out.println("GET: /person called");
		return service.getAllPerson();
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/person.search")
	public Page<Person> getAllPersonWithPagination(@RequestParam("size") Integer size,
			@RequestParam("startIndex") Integer startIndex) {
		LOGGER.info("/person.search:  size = {}, startIndex = {}", size, startIndex);
		PageRequest pageRequest = PageRequest.of(startIndex, size, Sort.by(Direction.DESC, "name"));
		return service.getPerson(pageRequest);
	}

	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable("id") Integer personId) {
		LOGGER.info("GET: /person/{id} id: {}", personId);
		return service.getPerson(personId);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/person")
	public void createPerson(@RequestBody Person person) {
		LOGGER.info("POST: /person Requestbody : {} ", person);
		service.savePerson(person);
	}

	@PutMapping("/person/{id}")
	public void updatePerson(@PathVariable("id") Integer personid, @RequestBody Person person) {
		LOGGER.info("PUT: /person/{id}  id: {}, Requestbody: {}", person);
		service.updatePerson(personid, person);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/person/{id}")
	public void deletePerson(@PathVariable("id") Integer personId) {
		System.out.println("DELETE: /person/{id} called");
		service.deletePerson(personId);
	}
}
