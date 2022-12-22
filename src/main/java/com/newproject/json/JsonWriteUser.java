package com.newproject.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class JsonWriteUser {
    public static void main(String[] args) {
        User user=new User("testautomation","automation123!","Admin");
        User user1=new User("testautomation1","automation123!","Admin");
        User user2=new User("testautomation2","automation123!","Admin");
        String userInfo=null;
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            userInfo=objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File( "json.File/User_info.json"),userInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
