package com.example.springBootSwaggerLearning.Exception;

public class StudentNotFoundException extends  RuntimeException{
    public StudentNotFoundException(String message){
        super(message);
    }
}
