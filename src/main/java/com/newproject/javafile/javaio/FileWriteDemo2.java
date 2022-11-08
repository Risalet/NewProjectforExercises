package com.newproject.javafile.javaio;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {

        String content="Test passed\nhow are you\nGood evening\n";
        DateTime time=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-SS");
        String timeStamp= time.toString(formatter);
        String fileName="testReport"+timeStamp+".txt";
        File myFile=new File("Test-Result"+File.separator+fileName);
        try {
            FileUtils.writeStringToFile(myFile,content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
