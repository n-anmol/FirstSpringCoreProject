package com.cg.spring.assignment_31_systaGMart;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerUtility {
    public List<Customer> retrieveCustomerComplaintDetails_ByProductType(Stream<Customer> customerStream, String productType){
        return customerStream.filter(c->c.getProductType().equalsIgnoreCase(productType)).collect(Collectors.toList());
    }

    public Stream<Customer> retrieveCustomerComplaintDetails_ByAddress(Stream<Customer> customerStream, String address){
        return customerStream.filter(c->c.getAddress().equalsIgnoreCase(address));
    }

    public Stream<Customer> checkForLuckyWinners(Stream<Customer> customerDetails, int range){
        return customerDetails.limit((long) range);
    }
}
