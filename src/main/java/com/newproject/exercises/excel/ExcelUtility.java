package com.newproject.exercises.excel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {
    //write a method to read data from Excel cell;
    //Filename,sheet,row,column
    public static String readFromExcel(String fileName, String sheetName, int rowNumber, int columnNumber) {
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
            System.out.println("Empty row, no data in the Excel sheet");
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

    public static List<String> readMultipleCellValue( ) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Test-Data/multipleTestData.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> country= new ArrayList<>();
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getLastRowNum();
        for (int r = 0; r <= rowCount; r++) {
            XSSFRow rows = sheet.getRow(r);
            if (rows == null) {
                System.out.println("Empty Row");
            } else {
                XSSFCell CountryCell = rows.getCell(0);
                XSSFCell CapitalCell = rows.getCell(1);
                XSSFCell PopulationCell = rows.getCell(2);
                country.add(CountryCell.getStringCellValue());
                country.add(CapitalCell.getStringCellValue());
                country.add(PopulationCell.getStringCellValue());
            }
        }
        return country;

    }





    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        String username= readFromExcel("Test-Data/loginUser.xlsx","login-info",3,0);
        String password= readFromExcel("Test-Data/loginUser.xlsx","login-info",3,1);
        System.out.println(username);
        System.out.println(password);
        System.out.println(readMultipleCellValue());







    }
}