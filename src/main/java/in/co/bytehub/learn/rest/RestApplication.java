package in.co.bytehub.learn.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		LOGGER.info("Application is started...");
		
	}

}
