package com.company.managers;

import com.company.model.Customer;

public class CustomerManager {
    private final Customer customer;

    public CustomerManager( Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void postInit() {
        System.out.println(customer + " has just been created.");
    }

    public void preDestroy() {
        System.out.println(customer + " has been deleted.");
    }
}
