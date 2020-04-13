package com.example.atividadedatabase.controller;

import com.example.atividadedatabase.entidade.Employee;
import com.example.atividadedatabase.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/Register")
    public ModelAndView registerEmployee(@ModelAttribute Employee employee){
        ModelAndView mv = new ModelAndView("register");   
        Employee aux = new Employee();
        
        System.out.println(employee);
        mv.addObject("inserido", service.insertEmployee(employee));
        return mv;
    }

    @GetMapping("/Register")
    public ModelAndView employee(){

        ModelAndView mv  = new ModelAndView("register");
        mv.addObject("inserido", true);

        return mv;
    }
    @GetMapping("/Employee")
    public ModelAndView getEmployees(){
        ModelAndView mv = new ModelAndView("employees");
        mv.addObject("employees", service.getEmployees());
        return mv;
    }


}