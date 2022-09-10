package com.example.NESTO_demo.Projects;

import Emploee.SalePerson;

import java.beans.Customizer;

public class Project {
    public String ID;
    public String client;
    public SalePerson salePerson;
    public double price;

    public Project(){

    }
    public Project(String ID, String client) {
        this.ID = ID;
        this.client = client;
    }
}
