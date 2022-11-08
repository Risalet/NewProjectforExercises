package com.newproject.javafile.csvfile;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVFileRead {
    public static List<String> readCSVFile(String folderName,String fileName,String headerName){
        List<String> values=new ArrayList<>();
        Reader reader= null;
        try {
            reader = new FileReader(folderName+ File.separator+fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterable<CSVRecord> records=null;
        try {
            records = CSVFormat.RFC4180.withHeader(headerName)
                    .parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord record:records){
            String contents=record.get(headerName);
            values.add(contents);
        }
        return values;
    }

    public static void main(String[] args) {

        CSVFileRead .readCSVFile("Test-Result","userinfo.csv","username,password,qaurl");
    }
}
