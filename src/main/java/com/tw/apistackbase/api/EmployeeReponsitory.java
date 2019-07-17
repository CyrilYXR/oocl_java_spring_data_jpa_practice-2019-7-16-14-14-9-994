package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReponsitory extends JpaRepository<Employee, Long> {
}
