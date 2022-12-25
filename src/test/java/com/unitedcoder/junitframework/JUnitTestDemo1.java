package com.unitedcoder.junitframework;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestDemo1 {

    @BeforeClass
    public static void setUp(){
        System.out.println(" Before ");
    }

    @Before
    public  void go(){
        System.out.println("GO<GO<GO");
    }

    @Test
    public void addCustomer(){
        System.out.println("Add Customer Test passed");
    }

    @Test
    public void editCustomer(){
        System.out.println("Edit Customer Test passed");
    }

    @Test
    public void deleteCustomer(){
        System.out.println("Delete Customer Test passed");
    }

}
