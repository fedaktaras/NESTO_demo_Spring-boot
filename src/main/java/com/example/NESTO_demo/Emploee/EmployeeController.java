package com.example.NESTO_demo.Emploee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){return employeeService.getAllEmployees();}

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void add(@RequestBody Employee employee){
        System.out.println("controller");
        employeeService.addEmployee(employee);
    }
}
