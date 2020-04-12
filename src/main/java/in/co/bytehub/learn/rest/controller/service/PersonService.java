package in.co.bytehub.learn.rest.controller.service;

import java.util.List;

import in.co.bytehub.learn.rest.controller.model.Person;

public interface PersonService {

	public List<Person> getAllPerson();

	public Person getPerson(Integer id);

	public void savePerson(Person person);

	public void updatePerson(Integer id, Person person);

	public void deletePerson(Integer id);
}
