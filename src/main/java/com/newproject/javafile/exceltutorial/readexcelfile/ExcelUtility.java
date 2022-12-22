package com.newproject.javafile.exceltutorial.readexcelfile;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtility {
    public String readFromExcelCell(String fileName, String sheetName,int rowNum, int cellNum){
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);

        String cellValue=null;

        XSSFRow row=sheet.getRow(rowNum);

        if (row==null){
            System.out.println("Empty Row");}
        else{
            XSSFCell cell=row.getCell(cellNum);
            CellType cellType=cell.getCellType();
            switch(cellType){
                case NUMERIC:
                    cellValue=String.valueOf(cell.getNumericCellValue());
                    break;
                case STRING:
                    cellValue=cell.getStringCellValue();
                    break;
            }
        }
        return cellValue;
    }

    public static void main(String[] args) {
        String fileName="Test-Data/MyDoc.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
        String userName=excelUtility.readFromExcelCell(fileName,"LoginInfo",1,0);
        String password=excelUtility.readFromExcelCell(fileName,"LoginInfo",1,1);
        System.out.println(userName);
        System.out.println(password);
    }
}
