package com.cg.spring.assignment_31_systaGMart;

import java.util.Objects;

public class Customer {
    private String name;
    private String address;
    private String pinCode;
    private String productType;
    private int warrantyPeriod;

    public Customer(String name, String address, String pinCode, String productType, int warrantyPeriod) {
        this.name = name;
        this.address = address;
        this.pinCode = pinCode;
        this.productType = productType;
        this.warrantyPeriod = warrantyPeriod;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", productType='" + productType + '\'' +
                ", warrantyPeriod=" + warrantyPeriod +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
