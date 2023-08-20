package io.zipcoder.persistenceapp.models;

import com.sun.tools.javac.jvm.Gen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long department_id;
    private String name;
    private Employee manager;

    public Department() {
        
    }

    public Department(Long department_id, String name, Employee manager) {
        this.department_id = department_id;
        this.name = name;
        this.manager = manager;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
