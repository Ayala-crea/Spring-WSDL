package com.example.pemograman.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pemograman.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
    List<Student> findAll();
}
