package com.newproject.exercises.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadMultipleValue {
    public static void main(String[] args) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("Test-Data/MyDoc.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet= workbook.getSheetAt(1);

        System.out.println(sheet.getLastRowNum());


        int rowCount= sheet.getLastRowNum();
        if (rowCount>=0){

        }


        int colCount=sheet.getRow(0).getLastCellNum();

        for (int i=0;i<=rowCount;i++){
            XSSFRow row=sheet.getRow(i);
            for (int j=0;j<colCount;j++){
                XSSFCell cell=row.getCell(j);
                switch (cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                }
                System.out.print(" / ");
            }
            System.out.println();
        }
    }
}
