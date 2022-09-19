package com.example.NESTO_demo.Emploee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(employeeArrayList::add);
        return employeeArrayList;
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }
}
