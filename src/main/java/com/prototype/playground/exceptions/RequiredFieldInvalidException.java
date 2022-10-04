package com.prototype.playground.exceptions;

public class RequiredFieldInvalidException extends RuntimeException {

    public RequiredFieldInvalidException(String message) {
        super(message);
    }
}
