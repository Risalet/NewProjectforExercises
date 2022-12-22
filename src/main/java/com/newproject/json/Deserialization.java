package com.newproject.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Deserialization {
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        Users users;

        {
            try {
                users = objectMapper.readValue(new File("json.File/Users.json"), Users.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            List<User> user=users.getUser();
            for (User loginUser:user){

                System.out.printf("%s %s %s ",
                        loginUser.getUserName(),
                        loginUser.getPassword(),
                        loginUser.getUserType());
            }
        }
    }
}
