package com.newproject.javafile.XLFile;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        String username=excelUtility.readFromExcel("Test-Data/loginUser.xlsx","login-info",1,0);
        String password=excelUtility.readFromExcel("Test-Data/loginUser.xlsx","login-info",2,1);
        System.out.println(username);
        System.out.println(password);


    }
}