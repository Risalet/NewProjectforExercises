package com.newproject.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Car> carList=new ArrayList<>();
        carList.add(new Car("Toyota","Red",3000,"2021"));
        carList.add(new Car("Tesura","Yellow",4000,"2019"));
        carList.add(new Car("Nissan","Black",2000,"2018"));
        carList.add(new Car("Mazda","White",1000,"2022"));
//        System.out.println(carList);

//        carList.sort(Comparator.comparing(Car::getPrice));
//        System.out.println(carList);
//        carList.sort(Comparator.comparing(Car::getPrice).reversed());
//        System.out.println(carList);

        Collections.sort(carList);
        System.out.println(carList);


    }
}
