package com.newproject.exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIO {
    //create a method to write a text file
    public void writeToFile(String fileFolder,String fileName,String extension,String content){
        //create a folder if this folder does not exist
        String workingDirectory=System.getProperty("user.dir");
        //C:\Users\Aynigar\SeleniumTestAutomation2021\test-Report\test.txt
        String finalDirectory=workingDirectory+File.separator+fileFolder;
        File file=new File(finalDirectory);
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder is created");
        }

        //file
        String finalFileName=finalDirectory+File.separator+fileName+extension;
        File myFile=new File(finalFileName);
        FileWriter writer= null;
        try {
            writer = new FileWriter(myFile.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        try {
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}