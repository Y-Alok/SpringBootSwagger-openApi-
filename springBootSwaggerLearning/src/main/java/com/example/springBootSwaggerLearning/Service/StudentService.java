package com.example.springBootSwaggerLearning.Service;

import com.example.springBootSwaggerLearning.Exception.StudentAlreadyExistsException;
import com.example.springBootSwaggerLearning.Exception.StudentNotFoundException;
import com.example.springBootSwaggerLearning.Model.Student;
import com.example.springBootSwaggerLearning.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student) {

        Optional<Student> optionalStudent = studentRepository.findById(student.getId());
        if(optionalStudent.isPresent()){
            throw new StudentAlreadyExistsException("Student with given id alreadyExists");
        }
        Student newStudent = new Student();
        newStudent.setId(student.getId());
        newStudent.setName(student.getName());
        newStudent.setEmailId(student.getEmailId());
        Student savedStudent = studentRepository.save(newStudent);
        return savedStudent;
    }

    public Student getStudent(int id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(!optionalStudent.isPresent()){
            throw new StudentNotFoundException("Student doesn`t exist");
        }
        Student newStudent = optionalStudent.get();
        return newStudent;
    }
}
