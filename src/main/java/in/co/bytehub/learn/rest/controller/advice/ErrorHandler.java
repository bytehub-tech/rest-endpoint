package in.co.bytehub.learn.rest.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import in.co.bytehub.learn.rest.exception.BaseException;
import in.co.bytehub.learn.rest.exception.ErrorRespose;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(BaseException.class)
	public ResponseEntity<Object> handleBaseException(BaseException exception){
		ErrorRespose errorResponse = new ErrorRespose();
		errorResponse.setMessage(exception.getMessage());
		errorResponse.setErrorCode(exception.getErrorCode().value());
		return new ResponseEntity<Object>(errorResponse, exception.getErrorCode());
		
	}
}
