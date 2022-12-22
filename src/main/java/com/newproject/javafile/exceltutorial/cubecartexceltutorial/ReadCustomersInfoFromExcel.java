package com.newproject.javafile.exceltutorial.cubecartexceltutorial;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomersInfoFromExcel {

    public List<CustomersInfo> getCustomersData(String filePath, String sheetName){

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
        XSSFSheet sheet=workbook.getSheet(sheetName);
        List<CustomersInfo> customerInfo=new ArrayList<>();
        int rowCount = sheet.getLastRowNum();
        for (int r=1;r<=rowCount;r++) {
            XSSFRow row = sheet.getRow(r);
            XSSFCell customerTitle = row.getCell(0);
            XSSFCell customerFirstName = row.getCell(1);
            XSSFCell customerLastName = row.getCell(2);
            XSSFCell email = row.getCell(3);
            XSSFCell phone = row.getCell(4);
            XSSFCell cellPhone = row.getCell(5);
            XSSFCell newPassword = row.getCell(6);
            CustomersInfo customersInfo=new CustomersInfo(
                    customerTitle.getStringCellValue(),
                    customerFirstName.getStringCellValue(),
                    customerLastName.getStringCellValue(),
                    email.getStringCellValue(),
                    (int) phone.getNumericCellValue(),
                    (int) cellPhone.getNumericCellValue(),
                    newPassword.getStringCellValue());
            customerInfo.add(customersInfo);
        }
       return customerInfo;
    }

    public static void main(String[] args) {
        ReadCustomersInfoFromExcel readCustomersInfoFromExcel=new ReadCustomersInfoFromExcel();
        List<CustomersInfo> customers=readCustomersInfoFromExcel.getCustomersData("Test-Data/MyDoc.xlsx","CustomerInfo");
        System.out.println(customers);

    }
}
