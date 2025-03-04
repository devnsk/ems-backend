package org.emp.ems_backend.department.controller;

import org.emp.ems_backend.department.model.Department;
import org.emp.ems_backend.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // Create Department
    @PostMapping("/add")
    public ResponseEntity<String> createDepartment(@RequestBody Department department) {
        String response = departmentService.addDepartment(department);
        return ResponseEntity.ok(response);
    }

    // Get All Departments
    @GetMapping("/find-all")
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }

}
