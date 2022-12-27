package com.unitedcoder.junitframework.pageobjectpattern;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromFiles {

    // //Method for read a specific key value pair from "config.properties" file
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
        System.out.printf("%s=%s%n",key,value);
        return value;
    }

    //read data from Excel cell
    public static String readFromExcel(String fileName ,String sheetName ,int rowNumber , int columnNumber) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(rowNumber);
        String cellValue = null;
        if (row == null) {
            System.out.println("Empty row , no data in the excel sheet");
        } else {
            XSSFCell cell = row.getCell(columnNumber);
            CellType cellType = cell.getCellType();
            switch (cellType) {
                case STRING:
                    cellValue = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    break;
            }
        }
        return cellValue;
    }
}
