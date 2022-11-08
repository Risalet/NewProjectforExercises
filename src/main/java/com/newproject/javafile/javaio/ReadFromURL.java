package com.newproject.javafile.javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFromURL {
    public static void main(String[] args) {
        String webSite="https://ja.wikipedia.org/wiki/%E3%82%B8%E3%83%A3%E3%83%B4%E3%82%A1%E3%83%B3";
        URL url= null;
        try {
            url = new URL(webSite);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        ;
        BufferedReader reader= null;
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String content;
        while (true){
            try {
                if (!((content= reader.readLine())!=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(content);
        }
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
