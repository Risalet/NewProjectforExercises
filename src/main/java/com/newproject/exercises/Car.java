package com.newproject.exercises;

public class Car implements Comparable<Car> {
    private String brand;
    private String color;
    private String price;

    public Car() {
    }

    public Car(String brand, String color, String price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + "," + color + "," + price;
    }

    @Override
    public int compareTo(Car car) {
        return this.color.compareTo(car.color);
    }
}