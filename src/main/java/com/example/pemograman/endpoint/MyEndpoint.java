package com.example.pemograman.endpoint;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.pemograman.model.Student;
import com.example.pemograman.repository.StudentRepository;


import com.example.demo.GetAllStudentRequest;
import com.example.demo.GetAllStudentResponse;
import com.example.demo.MyRequest;
import com.example.demo.MyResponse;


//digenerate jaxb

@Endpoint
public class MyEndpoint {
    
    @Autowired
    private StudentRepository studentRepository;

    @PayloadRoot(namespace = "http://example.com/demo", localPart = "MyRequest")
    @ResponsePayload
    public MyResponse myMethod(@RequestPayload MyRequest request) {
        MyResponse response = new MyResponse();
        response.setResponseMessage("This is a response to: " + request.getRequestMessage());
        return response;
    } 

    @PayloadRoot(namespace = "http://example.com/demo", localPart = "GetAllStudentRequest")
    @ResponsePayload
    public GetAllStudentResponse getAllStudentResponse(@RequestPayload GetAllStudentRequest request) {
        GetAllStudentResponse response = new GetAllStudentResponse();
        List<Student> students = studentRepository.findAll();
        List<com.example.pemograman.model.Student> responseStudents = new ArrayList<>();
        for (Student student : students) {
            com.example.pemograman.model.Student responseStudentsStudent = new com.example.pemograman.model.Student();
            responseStudentsStudent.setId(student.getId());
            responseStudentsStudent.setName(student.getName());
            responseStudentsStudent.setKelas(student.getKelas());
            responseStudents.add(responseStudentsStudent);
           // System.out.println("Product: " + product.getName());
            
        }
        response.getStudent();
        





        return response;
    }
      
}

