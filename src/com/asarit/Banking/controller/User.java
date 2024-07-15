package com.asarit.Banking.controller;

import com.asarit.Banking.model.Bank;
import com.asarit.Banking.repo.BankRepo;
import com.asarit.Banking.services.BankService;
import com.asarit.Banking.services.Imp.BankServicelmp;

public class User {
    public static void main(String[] args) {
        BankService bankService=new BankServicelmp();
        Bank obj=new Bank(411,"yash",4000,"sbi");
        Bank tony=new Bank(412,"tony umar",5000,"sbi");
        Bank sneha=new Bank(423,"snega",600,"sbi");

        bankService.createAccount(obj);
        bankService.createAccount(tony);
        bankService.createAccount(sneha);

       bankService.deposit(412,7000);

       bankService.jvd(9000);

        System.out.println(BankRepo.bankDb[0]);
        System.out.println(BankRepo.bankDb[1]);
        System.out.println(BankRepo.bankDb[2]);


    }
}