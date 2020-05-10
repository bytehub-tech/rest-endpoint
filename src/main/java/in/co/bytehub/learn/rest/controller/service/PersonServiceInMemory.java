package in.co.bytehub.learn.rest.controller.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.co.bytehub.learn.rest.controller.model.Person;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service("personServiceInMemory")
public class PersonServiceInMemory implements PersonService {

	private Map<Integer, Person> storage = new HashMap<Integer, Person>();

	@Override
	public List<Person> getAllPerson() {
		return new ArrayList(storage.values());
	}

	@Override
	public Person getPerson(Integer id) {
		return storage.get(id);
	}

	@Override
	public void savePerson(Person person) {
		storage.put(person.getPersonId(), person);
	}

	@Override
	public void updatePerson(Integer id, Person person) {
		storage.put(id, person);
	}

	@Override
	public void deletePerson(Integer id) {
		storage.remove(id);
	}
	
	@Override
	public Page<Person> getPerson(Pageable pageable){
		throw new RuntimeException("Not Implemented Method");
		
	}

}
