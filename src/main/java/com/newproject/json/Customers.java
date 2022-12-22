package com.newproject.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Customers {
    @JsonProperty("customers")
    private List<Customer> customer;

    public Customers() {
    }

    public Customers(List<Customer> customer) {
        this.customer = customer;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
}
