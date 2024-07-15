package com.asarit.Banking.services;

import com.asarit.Banking.model.Bank;

public interface BankService {

    boolean createAccount(Bank obj);

    boolean deposit(int accNo, int amount);

    boolean jvd(int amount);
}
