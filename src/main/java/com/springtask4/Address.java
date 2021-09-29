package com.springtask4;

public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public void findAddress(){
        System.out.println("Hurray,Autowire Working! Address is: "+getAddress());
    }
}
