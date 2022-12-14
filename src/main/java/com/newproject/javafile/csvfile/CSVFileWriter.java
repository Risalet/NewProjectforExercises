package com.newproject.javafile.csvfile;


import org.apache.commons.io.FileUtils;

import java.io.*;

public class CSVFileWriter {
    public static void writeCSVFile(String folderName,String fileName,String content) {
        File myFile = new File(folderName + File.separator + fileName + System.currentTimeMillis() + ".csv");
        System.out.println("My CSVFile is Created");

        try {
            FileUtils.writeStringToFile(myFile, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String content = "TestID,TestModule,TestType,TestStatus" + "\n" +
                "1,Customer,Regression,Passed" + "\n" +
                "2,Category,Smoke Test,Passed";
        CSVFileWriter.writeCSVFile("CSVFile","CSVFile-Test-Date", content);
    }
}
