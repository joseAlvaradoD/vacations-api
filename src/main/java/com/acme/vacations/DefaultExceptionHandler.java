package com.acme.vacations;

import com.mongodb.MongoWriteException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ DuplicateKeyException.class })
    @ResponseBody
    public ResponseEntity<String> handleRepositoryException(Exception ex) {
        if(ex instanceof DuplicateKeyException){
            MongoWriteException mongoWriteException = (MongoWriteException) ex.getCause();
            System.out.println(mongoWriteException.getErrorLabels());
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Your are using a duplicated key for name = "
                    + mongoWriteException.getError().getMessage());
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal error please contact with admin team");
    }
}
