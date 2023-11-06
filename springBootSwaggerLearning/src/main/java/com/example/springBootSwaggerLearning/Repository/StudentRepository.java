package com.example.springBootSwaggerLearning.Repository;

import com.example.springBootSwaggerLearning.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
