package com.newproject.exercises.excel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    public String readExcelFromCell(String fileName,String sheetName,int rowNum,int cellNum){
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet= workbook.getSheet(sheetName);
        XSSFRow row= sheet.getRow(rowNum);
        String cellValue=null;
        if (row==null){
            System.out.println("Empty Row");
        }else{
            XSSFCell cell= row.getCell(cellNum);
            CellType cellType=cell.getCellType();
            switch (cellType){
                case NUMERIC:
                    cellValue=String.valueOf(cell.getNumericCellValue());
                    System.out.println(cellValue);
                    break;
                case STRING:
                    cellValue=cell.getStringCellValue();
                    System.out.println(cellValue);
                    break;
            }
        }
        return cellValue;
    }

    public static void main(String[] args) {
        String fileName="Test-Data/MyDoc.xlsx";
        ReadExcelFile readExcelFile=new ReadExcelFile();
        String userName= readExcelFile.readExcelFromCell(fileName,"LoginInfo",1,0);
        String password=readExcelFile.readExcelFromCell(fileName,"LoginInfo",1,1);


    }
}
