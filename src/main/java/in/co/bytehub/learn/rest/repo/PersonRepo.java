package in.co.bytehub.learn.rest.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.co.bytehub.learn.rest.controller.model.Person;

public interface PersonRepo extends PagingAndSortingRepository<Person, Integer> {
	
	List<Person> findByAadharNoAndName(String aadharNo, String name);
	
}
