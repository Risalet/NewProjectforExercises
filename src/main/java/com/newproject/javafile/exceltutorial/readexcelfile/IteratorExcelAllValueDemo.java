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

public class IteratorExcelAllValueDemo {
    public List<String> getExcelInfo(String filePath,String sheetName){
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(filePath);
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

        List<String> info=new ArrayList<>();
        Iterator<Row> rows=sheet.iterator();
        while (rows.hasNext()){
            Row r= rows.next();
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
        return info;
    }

    public static void main(String[] args) {
        IteratorExcelAllValueDemo iteratorExcelDemo=new IteratorExcelAllValueDemo();
        List<String> info =iteratorExcelDemo.getExcelInfo("Test-Data/MyDoc.xlsx","CustomerInfo");
        System.out.println(info);

    }
}
