package Emploee;

import javax.persistence.*;

enum EmploeePosition {DIRECTOR, SALE_MANAGER, SALE_PERSON, CONSTRUCTOR_MANAGER, CONSTRUCTOR,  PRODUCTION_MANAGER,  SUPPLY_MANAGER, ACCOUNTANT}

public abstract class Employee {

    public int id;
    public String FirstName;
    public String LastName;
    //public EmploeePosition Position;


}
