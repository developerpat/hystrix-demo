package de.arnoldpa.examples.hystrix.client.exception;

import com.netflix.hystrix.exception.HystrixRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestExceptionHandler {

    @ExceptionHandler(value = HystrixRuntimeException.class)
    public ResponseEntity handleHystrixRuntimeException(HystrixRuntimeException e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
