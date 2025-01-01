package com.springcrud.springbootcrudsample.repository;

import com.springcrud.springbootcrudsample.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
