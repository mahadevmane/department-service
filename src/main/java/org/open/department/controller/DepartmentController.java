package org.open.department.controller;

import lombok.extern.slf4j.Slf4j;
import org.open.department.entity.Department;
import org.open.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") long departmentId) {
        log.info("Inside findDepartmentById method");
        return departmentService.findDepartmentById(departmentId);
    }
}
