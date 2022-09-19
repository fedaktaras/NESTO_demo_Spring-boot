package com.example.NESTO_demo.Projects;

import com.example.NESTO_demo.Emploee.Employee;

import javax.persistence.*;

@Entity
@Table
public class Project {
    @Id
    public Integer ID;
    public String client;
    @ManyToOne
    @JoinColumn(name="employee_id", nullable=false)
    public Employee salePerson;
    public double price;

    public Project(){

    }
    public Project(Integer id, String client, Employee employee) {
        this.client = client;
        this.ID = id;
        salePerson = employee;
    }

}
