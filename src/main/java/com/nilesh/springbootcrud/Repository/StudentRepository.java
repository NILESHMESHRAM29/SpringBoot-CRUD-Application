package com.nilesh.springbootcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilesh.springbootcrud.Entity.StudentInfo;

public interface StudentRepository extends JpaRepository<StudentInfo, Long> {

}
