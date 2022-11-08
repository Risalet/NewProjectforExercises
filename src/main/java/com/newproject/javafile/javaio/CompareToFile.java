package com.newproject.javafile.javaio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CompareToFile {
    public static void main(String[] args) {
        File file1=new File("Test-Result"+File.separator+"testReport2022-10-29-09-03-07.txt");
        File file2=new File("Test-Result"+File.separator+"testResult.txt");
        String file1Content = null;
        String file2Content = null;
        try {
          file1Content= FileUtils.readFileToString(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file2Content= FileUtils.readFileToString(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (file1Content.equalsIgnoreCase(file2Content)){
            System.out.println("File is Same");
        }
        else
            System.out.println("File is different");
    }

}
