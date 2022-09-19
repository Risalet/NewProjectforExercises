package com.newproject.mapdatastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> website=new HashMap<>();
        website.put("Google","https://www.google.com");
        website.put("Yahoo","https://www.yahoo.com");
        website.put("Youtube","https://www.youtube.com");
        website.put("CNN","https://www.cnn.com");
        System.out.println("Total iteam: "+website.size());
        System.out.println(website.get("Youtube"));
        Set<String> sites=website.keySet();
        for (String site: sites){
            System.out.println(String.format("Site %s  Url %s",site,website.get(site)));
        }
        website.replace("CNN","https://www.cnn.com","https://cnn.com");
        System.out.println(website.get("CNN"));
        website.put("cnn","https://cnn.com");
        System.out.println(website.get("cnn"));
        website.remove("CNN");
        System.out.println(website.get("CNN"));
    }

}
