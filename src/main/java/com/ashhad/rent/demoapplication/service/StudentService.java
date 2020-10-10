package com.ashhad.rent.demoapplication.service;

import com.ashhad.rent.demoapplication.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
