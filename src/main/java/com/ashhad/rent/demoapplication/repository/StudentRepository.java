package com.ashhad.rent.demoapplication.repository;

import com.ashhad.rent.demoapplication.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
