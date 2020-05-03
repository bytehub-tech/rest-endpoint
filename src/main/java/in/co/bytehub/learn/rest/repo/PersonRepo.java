package in.co.bytehub.learn.rest.repo;

import org.springframework.data.repository.CrudRepository;

import in.co.bytehub.learn.rest.controller.model.Person;

public interface PersonRepo extends CrudRepository<Person, Integer> {

}
