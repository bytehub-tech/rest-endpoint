package in.co.bytehub.learn.rest.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.bytehub.learn.rest.controller.model.Person;
import in.co.bytehub.learn.rest.repo.PersonRepo;

@Service(value = "personServiceFromDB")
public class PersonServiceDB implements PersonService {

	@Autowired
	private PersonRepo personRepo;

	@Override
	public List<Person> getAllPerson() {
		List<Person> responseLst = new ArrayList<>();
		personRepo.findAll().forEach(responseLst::add);
		return responseLst;
	}

	@Override
	public Person getPerson(Integer id) {
		return personRepo.findById(id).orElseThrow(() -> new RuntimeException("Record Not Found for Id:" + id));
	}

	@Override
	public void savePerson(Person person) {
		if (personRepo.existsById(person.getPersonId())) {
			throw new RuntimeException("Record already exists for id : " + person.getPersonId());
		}
		personRepo.save(person);
	}

	@Override
	public void updatePerson(Integer id, Person person) {
		person.setPersonId(id);
		personRepo.save(person);
	}

	@Override
	public void deletePerson(Integer id) {
		personRepo.deleteById(id);

	}

}
