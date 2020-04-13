package com.example.atividadedatabase.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

/**
 * Employee
 */
@Entity
public class Employee implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id 
       // @GeneratedValue(strategy = GenerationType.AUTO)
        @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ID;//chave primaria
    @NotNull
    private String name;
    @NotNull
    private Double salary;
    @NotNull
    private int workload;
    @NotNull
    private int age;

    public Long getID() {
        return ID;
    }

    public void setID(final Long iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(final Double salary) {
        this.salary = salary;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(final int workload) {
        this.workload = workload;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + ID + ", age=" + age + ", name=" + name + ", salary=" + salary + ", workload="
                + workload + "]";
    }

    
}