package com.asarit.Banking.model;

public class Employee {
    private int id;
    private String name;
    private long phoneNumber;
    private Bank bank;
    private Address address;

    public Employee() {
    }

    public Employee(int id, String name, long phoneNumber, Bank bank, Address address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bank = bank;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", bank=" + bank +
                ", address=" + address +
                '}';
    }
}
