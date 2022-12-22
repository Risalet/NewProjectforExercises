package com.newproject.javafile.exceltutorial.readexcelfile;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadMultiDataFromExcel {

    public  void getMultiDataFromExcel(String filePath, String sheetName) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(1).getLastCellNum();
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

    public static void main(String[] args) {
        ReadMultiDataFromExcel readFromMultipleCell=new ReadMultiDataFromExcel();
        readFromMultipleCell.getMultiDataFromExcel("Test-Data/MyDoc.xlsx","CustomerInfo");
    }
}



