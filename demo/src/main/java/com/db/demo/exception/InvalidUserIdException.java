package com.db.demo.exception;

public class InvalidUserIdException extends ValidationException {

    public InvalidUserIdException(String message) {
        super(message);
    }
}