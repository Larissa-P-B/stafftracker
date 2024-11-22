package com.example.stafftracker.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stafftracker.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}