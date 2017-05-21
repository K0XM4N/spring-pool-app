package com.prodevs.service;

import com.prodevs.model.Employee;
import com.prodevs.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Krzysztof on 2017-05-21.
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepo;

    public EmployeeService(EmployeeRepository repository){
        this.employeeRepo = repository;
    }


    public Employee findByEmployeeId(Integer employeeId){

        return employeeRepo.findOne(employeeId);

    }

    public List<Employee> findAll(){

        return employeeRepo.findAll();

    }

    public Employee save(Employee savedEmployee){

        return employeeRepo.saveAndFlush(savedEmployee);

    }

    public Employee update(Employee modifiedEmployee, Integer oldEmployeeId){

        Employee updatedEmployee = employeeRepo.findOne(oldEmployeeId);
        BeanUtils.copyProperties(updatedEmployee,oldEmployeeId);

        return employeeRepo.saveAndFlush(updatedEmployee);

    }

    public void delete(Employee deletedEmployee){

        employeeRepo.delete(deletedEmployee);

    }
}
