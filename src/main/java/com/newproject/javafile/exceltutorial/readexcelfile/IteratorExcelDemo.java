package com.newproject.javafile.exceltutorial.readexcelfile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExcelDemo {

    public List<String> getSpecificInfoFromExcel(String filePath,String sheetName,String name,int column) {
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Iterator Sheet
       int sheets= workbook.getNumberOfSheets();
       List<String> info=new ArrayList<>();
       for (int i=0;i<sheets; i++){
           if(workbook.getSheetName(i).equalsIgnoreCase(sheetName)){
               XSSFSheet sheet= workbook.getSheetAt(i);
               Iterator<Row> rows=sheet.iterator();
               //Row firstRow= rows.next();
               //Iterator<Cell> cell=firstRow.iterator();
               while (rows.hasNext()){
                   Row r=rows.next();
                   if (r.getCell(1).getStringCellValue().equalsIgnoreCase(name)){
                       Iterator<Cell> c= r.cellIterator();
                       while (c.hasNext()){
                           Cell c1=c.next();
                           if (c1.getCellType()== CellType.STRING){
                               info.add(c1.getStringCellValue());
                           }else{
                               info.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
                           }
                       }
                   }
               }
           }
       }
       return info;
    }

    public static void main(String[] args) {
        IteratorExcelDemo iteratorExcelDemo=new IteratorExcelDemo();
        List<String> customerInfo=iteratorExcelDemo.getSpecificInfoFromExcel("Test-Data/MyDoc.xlsx","CustomerInfo","David-22",1);
        System.out.println(customerInfo);

    }
}

