package com.newproject.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarComparable {
    public static void main(String[] args) {
        ArrayList<Car> carList=new ArrayList<>();
        carList.add(new Car("Toyota","White","10000"));
        carList.add(new Car("Mazda","Black","20000"));
        carList.add(new Car("Nisan","Yellow","100450"));

//        carList.sort(Comparator.comparing(Car::getBrand));
//        System.out.println(carList);
//        carList.sort(Comparator.comparing(Car::getColor));
//        System.out.println(carList);
//        carList.sort(Comparator.comparing(Car::getPrice));
//        System.out.println(carList);
//        carList.sort(Comparator.comparing(Car::getPrice).reversed());
//        System.out.println(carList);

        Collections.sort(carList);
        System.out.println(carList);







    }
}
