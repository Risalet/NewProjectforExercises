package com.newproject.javafile.exceltutorial.writeexcelfile;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteExcelFileDemo {

    public void writeToExcelCells(String pathName,String sheetName, List<String> contents) {
        //define a file to write content
        File excelFile=new File(pathName);
        //define a workBook
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet(sheetName);
        int numberOfRows= contents.size();
        for (int rowNumber=0;rowNumber<numberOfRows;rowNumber++){
            XSSFRow row= sheet.createRow(rowNumber);
            String [] rowContent=contents.get(rowNumber).split(",");
            System.out.println(Arrays.toString(rowContent));
            int totalCell=rowContent.length;
            for (int cellNumber=0;cellNumber<totalCell;cellNumber++){
                XSSFCell cell=row.createCell(cellNumber);
                cell.setCellValue(rowContent[cellNumber]);
            }
        }
        FileOutputStream fileOutputStream= null;
        try {
            fileOutputStream = new FileOutputStream(excelFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.write(fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        WriteExcelFileDemo writeExcelFileDemo=new WriteExcelFileDemo();
        List<String> loginInfo=new ArrayList<>();
        loginInfo.add("userName,password");
        loginInfo.add("testautomation,automation123!");
        loginInfo.add("testautomation1,automation123!");
        loginInfo.add("testautomation2,automation123!");

        writeExcelFileDemo.writeToExcelCells("Test-Data/LoginInfo.xlsx","CubeCart-LoginInfo",loginInfo);

    }
}
