package com.asarit.Banking.services.Imp;

import com.asarit.Banking.model.Employee;
import com.asarit.Banking.repo.EmployeeRepo;
import com.asarit.Banking.services.EmployeeService;

public class EmployeeServicelmp implements EmployeeService {

    @Override
    public boolean createEmployee(Employee employee) {
        EmployeeRepo.employeeDb[0]=employee;
        return false;
    }
}
