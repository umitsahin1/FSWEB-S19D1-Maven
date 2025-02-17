package com.workintech.s18d2.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class PlantException extends RuntimeException {


    private HttpStatus status;

    public PlantException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public PlantException(String message) {
        super(message);
        this.status = HttpStatus.INTERNAL_SERVER_ERROR; // Default status
    }
    public HttpStatus getHttpStatus() {
        return status;

    }
}
