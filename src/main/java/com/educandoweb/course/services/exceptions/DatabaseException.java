package com.educandoweb.course.services.exceptions;

public class DatabaseException extends RuntimeException {

    public DatabaseException() {
        super("User cannot be deleted");
    }
}
