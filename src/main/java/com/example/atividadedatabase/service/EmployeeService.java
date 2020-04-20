package com.example.atividadedatabase.service;

import java.util.List;

import com.example.atividadedatabase.entidade.Employee;
import com.example.atividadedatabase.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getEmployees(){
        
        return repository.findAll();
    }

    public boolean insertEmployee(Employee employee){
        
        if(employee.getAge() < 16   || employee.getSalary() < 1045.0 || employee.getWorkload() < 6 || employee.getWorkload() > 12)//Caso o campo nome esteja em branco, idade menor que 16, salário menor que 1045 ou carga horária menor que 6 ou carga horária maior que 12 
            return false;
        if(repository.save(employee) != null)
            return true;
        return false;
    }
}