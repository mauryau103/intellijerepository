package com.example.liquibasespringboot;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    @Query("SELECT name FROM Student s WHERE s.name LIKE %:studentName%")
    String findByName(String studentName);
}
