package com.newproject.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonWriteCustomers {
    public static void main(String[] args) {
        Customer customer=new Customer("David","1","08012345678","david@gmail.com","049123456768","12345678");
        Customer customer1=new Customer("Aavid","2","08058496874","aavid@gmail.com","049123456768","95673016");
        Customer customer2=new Customer("Savid","3","08008673256","savid@gmail.com","049123456768","04236781");
        Customer customer3=new Customer("Mavid","4","08019786950","mavid@gmail.com","049123456768","78502547");
        Customer customer4=new Customer("Kavid","5","08039087654","kavid@gmail.com","049123456768","09786542");
        Customer customer5=new Customer("Bavid","6","08038925670","bavid@gmail.com","049123456768","15860321");
        Customer customer6=new Customer("Zavid","7","08018952068","zavid@gmail.com","049123456768","187967586");
        Customer customer7=new Customer("Javid","8","08069087621","javid@gmail.com","049123456768","09879564");
        List<Customer> customers=new ArrayList<>();
        customers.addAll(Arrays.asList(customer,customer1,customer2,customer3,customer4,customer5,customer6,customer7));
        Customers listOfCustomers=new Customers(customers);
        ObjectMapper objectMapper=new ObjectMapper();
        String objectValue= null;
        try {
            objectValue = objectMapper.writeValueAsString(listOfCustomers);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("json.File/Customers.json"),objectValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
