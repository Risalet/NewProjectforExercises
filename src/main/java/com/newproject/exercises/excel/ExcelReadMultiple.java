package com.newproject.exercises.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadMultiple {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Test-Data/MyDoc.xlsx");//reading mode
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheet("CustomerInfo");

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();
        System.out.println("Total Row Count " + rowCount);
        System.out.println("colum count " + colCount);

        for (int i = 0; i <= rowCount; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int cell = 0; cell < colCount; cell++) {
                XSSFCell cell1 = row.getCell(cell);
                switch (cell1.getCellType()) {
                    case STRING:
                        System.out.print(cell1.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell1.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println(cell1.getBooleanCellValue());
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

    }
}

