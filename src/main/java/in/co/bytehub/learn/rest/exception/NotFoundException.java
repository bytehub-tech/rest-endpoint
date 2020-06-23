package in.co.bytehub.learn.rest.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException{

	public NotFoundException(HttpStatus errorCode, String message) {
		super(errorCode, message);
	}
}
