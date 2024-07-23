package com.asarit.Banking.services;

import com.asarit.Banking.exceptions.BankException;
import com.asarit.Banking.model.Bank;

import java.io.FileNotFoundException;

public interface BankService {

    boolean createAccount(Bank obj)throws BankException;

    boolean deposit(int accNo, int amount)throws BankException;

    boolean jvd(int amount);
}
