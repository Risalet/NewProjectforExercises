package com.newproject.object;

public class Car implements Comparable <Car>{
    private String brand;
    private String color;
    private int price;
    private String made;

    public Car() {
    }

    public Car(String brand, String color, int price, String made) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.made = made;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
     public String toString() {
    return brand+" , "+ color+" " +
            " "+price+" " +
            " "+made+"  ";
    }

    @Override
    public int compareTo(Car car) {
        if (price == car.price)
            return 0;
        else if (price < car.price)
            return 1;
        else
            return -1;
    }
}



