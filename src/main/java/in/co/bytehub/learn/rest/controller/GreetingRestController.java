package in.co.bytehub.learn.rest.controller;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import in.co.bytehub.learn.rest.controller.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

	@GetMapping(value = "/hello")
	public Map<String, String> greet() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "Ajay");
		map.put("designation", "Manager");
		return map;
	}

	@GetMapping(value = "/welcome")
	public String welcome() {
		return "Welcome to the cosmos for programming !!!";
	}

	@GetMapping(value = "/hi")
	public String hi() {
		return "hi";
	}

	@GetMapping("/testPerson")
	public Person testPerson(){
		return new Person().setTtl(Duration.of(10, ChronoUnit.MINUTES)).setName("Ajay").setInstant(Instant.now());

	}

}
