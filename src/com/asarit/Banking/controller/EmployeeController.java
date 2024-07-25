package com.asarit.Banking.controller;

import com.asarit.Banking.model.Address;
import com.asarit.Banking.model.Bank;
import com.asarit.Banking.model.Employee;
import com.asarit.Banking.repo.EmployeeRepo;
import com.asarit.Banking.services.EmployeeService;
import com.asarit.Banking.services.Imp.EmployeeServicelmp;

public class EmployeeController {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServicelmp();

        Bank tonyObj=new Bank(1234,"tonyKumar",5000,"sbi");
        Address tonyAddress=new Address("4/149","80","benglaur","karnool",51787);
        Employee tony=new Employee();
        int id=411;
        tony.setId(id);
        tony.setName("tony");
        tony.setPhoneNumber(94913);
        tony.setBank(tonyObj);
        tony.setAddress(tonyAddress);

        employeeService.createEmployee(tony);

        System.out.println("i am in croller"+EmployeeRepo.employeeDb[0]);

    }
}
