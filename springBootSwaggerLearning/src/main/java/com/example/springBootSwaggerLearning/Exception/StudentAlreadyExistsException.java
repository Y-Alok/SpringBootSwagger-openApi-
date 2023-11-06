package com.example.springBootSwaggerLearning.Exception;

public class StudentAlreadyExistsException extends  RuntimeException{
    public StudentAlreadyExistsException(String message){
        super(message);
    }
}
