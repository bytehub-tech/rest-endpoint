package in.co.bytehub.learn.rest.exception;

import org.springframework.http.HttpStatus;

public class NotImplementedException extends BaseException {

    public NotImplementedException(HttpStatus errorCode, String message) {
        super(errorCode, message);
    }
}
