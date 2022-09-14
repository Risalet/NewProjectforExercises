package com.newproject.importantmethods;

public class ExtractDoubleFromString {
    public static void main(String[] args) {
        String price = "Book: $ 0.6887 zone , ";
        String[] Price = price.split(" ");
        Double ProductionPrice=Double.parseDouble(Price[2]);
        System.out.println(ProductionPrice);

        String stripedValue = (price.replaceAll("[\\s+a-zA-Z : $ , ]",""));
        double ProductionPrice1 = Double.parseDouble(stripedValue);
        System.out.println(ProductionPrice1);

        String search = " 約 1,440,000,000 件 （0.55 秒）";
        String  search1= search.replace("（0.55 秒）","").replaceAll("[\\s+約 件 ,]","");
        System.out.println(search1);
    }
}