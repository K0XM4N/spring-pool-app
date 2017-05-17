package com.prodevs.repository;

import com.prodevs.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Krzysztof on 2017-05-17.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
