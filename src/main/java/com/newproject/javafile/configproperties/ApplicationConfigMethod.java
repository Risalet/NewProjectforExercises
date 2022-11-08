package com.newproject.javafile.configproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfigMethod {
    public static String readFromPropertiesFile(String fileName,String key ){
        Properties properties=new Properties();
        FileInputStream inputStream= null;
        String value;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        value=properties.getProperty(key);
        System.out.println(String.format("%s=%s",key,value));
        return value;
    }

    public static void main(String[] args) {
        String configFile="config.properties";
        ApplicationConfigMethod.readFromPropertiesFile(configFile,"qaurl");
        ApplicationConfigMethod.readFromPropertiesFile(configFile,"timeout");
        ApplicationConfigMethod.readFromPropertiesFile(configFile,"username");
        ApplicationConfigMethod.readFromPropertiesFile(configFile,"password");
    }

}
