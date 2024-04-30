package com.tugas.ats.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tugas.ats.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
    List<Student> findAll();
}
