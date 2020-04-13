package com.example.atividadedatabase.repository;

import com.example.atividadedatabase.entidade.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    
}