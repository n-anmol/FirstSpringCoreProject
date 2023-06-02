package com.cg.spring.assignment_31_systaGMart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInterface {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number of Customers: ");
        int count = read.nextInt();
        List<Customer> customers = new ArrayList<>();
//        Customer tempCustomer;
//        for(int i=0;i<count;i++){
//            tempCustomer = new Customer();
//            System.out.println("Enter customer "+ i + "details: ");
//            System.out.println("Name: ");
//            tempCustomer.setName(read.next());
//            System.out.println("Address: ");
//            tempCustomer.setAddress(read.next());
//            System.out.println("Pincode: ");
//            tempCustomer.setPinCode(read.next());
//            System.out.println("ProductType: ");
//            tempCustomer.setProductType(read.next());
//            System.out.println("WarrantyPeriod: ");
//            tempCustomer.setWarrantyPeriod(read.nextInt());
//            customers.add(tempCustomer);
//        }
        customers.add(new Customer("Customer-1", "address-1", "100101", "ProductType-1", 6));
        customers.add(new Customer("Customer-2", "address-2", "100102", "ProductType-2", 8));
        customers.add(new Customer("Customer-3", "address-3", "100103", "ProductType-3", 3));
        customers.add(new Customer("Customer-4", "address-4", "100104", "ProductType-1", 1));
        customers.add(new Customer("Customer-5", "address-2", "100105", "ProductType-5", 8));
        customers.add(new Customer("Customer-6", "address-6", "100106", "ProductType-1", 9));
        customers.add(new Customer("Customer-7", "address-2", "100107", "ProductType-7", 10));

        System.out.print("Enter product type for retrieval: ");
        CustomerUtility util = new CustomerUtility();
        List<Customer> productCusts = util.retrieveCustomerComplaintDetails_ByProductType(customers.stream(), read.next());
        if (productCusts.size() == 0) {
            System.out.println("No complaints for this product");
        } else {
            for (Customer eachCustomer : productCusts) {
                System.out.println(eachCustomer);
            }
        }

        System.out.print("Enter address for retrieval: ");
        List<Customer> addressCusts = util.retrieveCustomerComplaintDetails_ByAddress(customers.stream(), read.next()).collect(Collectors.toList());
        if (productCusts.size() == 0) {
            System.out.println("No complaints for this address");
        } else {
            for (Customer eachCustomer : addressCusts) {
                System.out.println(eachCustomer);
            }
        }

        System.out.print("Enter range: ");
        List<Customer> luckyCusts = util.checkForLuckyWinners(customers.stream(), read.nextInt()).collect(Collectors.toList());
        for (Customer eachCustomer : luckyCusts) {
            System.out.println(eachCustomer);
        }
    }
}
