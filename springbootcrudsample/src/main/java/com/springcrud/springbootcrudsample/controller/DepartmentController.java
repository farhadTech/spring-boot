package com.springcrud.springbootcrudsample.controller;

import com.springcrud.springbootcrudsample.entity.Department;
import com.springcrud.springbootcrudsample.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public ResponseEntity<Department> saveDepartment(
            @Valid @RequestBody Department department) {
        Department savedDepartment = departmentService.saveDepartment(department);
        return ResponseEntity.ok(savedDepartment);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> fetchDepartmentList() {
        List<Department> departments = departmentService.fetchDepartmentList();
        return ResponseEntity.ok(departments);
    }

    @PutMapping("/departments/{id}")
    public ResponseEntity<Department> updateDepartment(
            @RequestBody Department department,
            @PathVariable("id") Long departmentId) {
        Department updatedDepartment = departmentService.updateDepartment(department, departmentId);
        return ResponseEntity.ok(updatedDepartment);
    }

    @DeleteMapping("/departments/{id}")
    public ResponseEntity<String> deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return ResponseEntity.ok("Department deleted successfully");
    }
}
