package com.example.hibernatedemo.dao;

import com.example.hibernatedemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById (Integer id);

    List<Student> findAll();

   }
