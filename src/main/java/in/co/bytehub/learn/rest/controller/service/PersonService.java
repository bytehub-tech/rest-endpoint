package in.co.bytehub.learn.rest.controller.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.co.bytehub.learn.rest.controller.model.Person;

public interface PersonService {

	public List<Person> getAllPerson();

	public Person getPerson(Integer id);

	public void savePerson(Person person);

	public void updatePerson(Integer id, Person person);

	public void deletePerson(Integer id);
	
	public Page<Person> getPerson(Pageable pageable);
	
}
