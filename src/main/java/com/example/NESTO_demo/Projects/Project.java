package com.example.NESTO_demo.Projects;

import Emploee.SalePerson;
import jdk.jfr.Enabled;

import javax.persistence.*;
import java.beans.Customizer;

@Entity
@Table
public class Project {
    @Id
    public String ID;

    public String client;

    public String salePerson;
    public double price;

    public Project(){

    }
    public Project(String id, String client) {
        this.client = client;
        this.ID = id;
    }
    public Project createCopy(){
        Project project = new Project();
        project.ID = this.ID;
        project.client = this.client;
        project.price = this.price;
        project.salePerson = this.salePerson;
        return  project;
    }
}
