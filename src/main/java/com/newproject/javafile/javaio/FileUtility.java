package com.newproject.javafile.javaio;

import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    //Create a method to write a text file
    public void writeToFile(String fileFolder, String fileName, String extension, String content) {
        String workingDirectory = System.getProperty("user.dir");
        String finalDirectory = workingDirectory + File.separator + fileFolder;
        File file = new File(finalDirectory);
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Folder is created");
        }
        //file
        String finalFileName = finalDirectory + File.separator + fileName + extension;
        File myFile = new File(finalFileName);
        FileWriter writer = null;
        try {
            writer = new FileWriter(myFile.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        try {
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileUtils(String fileFolder, String fileName, String content) {
//        DateTime time=new DateTime();
//        DateTimeFormatter formatter=DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-SS");
//        String timeStamp= time.toString(formatter);
//        File myFile=new File(fileFolder+File.separator+fileName+timeStamp+".txt");
        File myFile = new File(fileFolder + File.separator + fileName + System.currentTimeMillis() + ".txt");
        System.out.println("My File is Created");

        try {
            FileUtils.writeStringToFile(myFile, content);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}


