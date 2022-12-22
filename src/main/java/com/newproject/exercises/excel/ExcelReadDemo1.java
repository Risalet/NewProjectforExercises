package com.newproject.exercises.excel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadDemo1 {
    public String readFromExcel(String fileName,String sheetName,int rowNum,int colNum ) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(rowNum);
        String cellValue = null;
        if (row == null) {
            System.out.println("Empty row,no data in the Excel sheet");
        } else {
            XSSFCell cell = row.getCell(colNum);
            CellType cellType = cell.getCellType();
            switch (cellType) {
                case STRING:
                    cellValue = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    break;
                case BOOLEAN:
                    cellValue = String.valueOf(cell.getBooleanCellValue());
                    break;
            }
        }
        return cellValue;
    }

    public static void main(String[] args) {
        ExcelReadDemo1 excelReadDemo1=new ExcelReadDemo1();
        String username=excelReadDemo1.readFromExcel("Test-Data/loginUser.xlsx","login-info",1,0);
        String password=excelReadDemo1.readFromExcel("Test-Data/loginUser.xlsx","login-info",2,1);
        System.out.println(username);
        System.out.println(password);

    }

}
