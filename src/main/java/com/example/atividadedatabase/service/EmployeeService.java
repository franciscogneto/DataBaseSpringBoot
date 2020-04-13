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
        
        if(employee.getAge() < 16  && employee.getName().trim().length() == 0 || employee.getSalary() < 900.0 || employee.getWorkload() < 6)
            return false;
        if(repository.save(employee) != null)
            return true;
        return false;
    }
}