package com.asarit.Banking.model;

public class Bank {
    private int accNO;
    private String name;
    private double balance;
    private String bankName;

    public Bank(int accNO, String name, double balance, String bankName) {
        this.accNO = accNO;
        this.name = name;
        this.balance = balance;
        this.bankName = bankName;
    }

    public int getAccNO() {
        return accNO;
    }

    public void setAccNO(int accNO) {
        this.accNO = accNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accNO=" + accNO +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
