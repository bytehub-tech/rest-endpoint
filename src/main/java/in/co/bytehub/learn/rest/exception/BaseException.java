package in.co.bytehub.learn.rest.exception;

import org.springframework.http.HttpStatus;

public abstract class BaseException extends RuntimeException {

	private HttpStatus errorCode;

	public BaseException(HttpStatus errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public HttpStatus getErrorCode() {
		return errorCode;
	}
}
