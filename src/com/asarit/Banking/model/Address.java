package com.asarit.Banking.model;

public class Address {
    private String dooNo;
    private String street;
    private String city;
    private String  disct;
    private int pincode;
    public Address(){

    }

    public Address(String dooNo, String street, String city, String disct, int pincode) {
        this.dooNo = dooNo;
        this.street = street;
        this.city = city;
        this.disct = disct;
        this.pincode = pincode;
    }

    public String getDooNo() {
        return dooNo;
    }

    public void setDooNo(String dooNo) {
        this.dooNo = dooNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDisct() {
        return disct;
    }

    public void setDisct(String disct) {
        this.disct = disct;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "dooNo='" + dooNo + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", disct='" + disct + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
