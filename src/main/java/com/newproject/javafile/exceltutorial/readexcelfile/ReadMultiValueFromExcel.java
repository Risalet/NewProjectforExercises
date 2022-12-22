package com.newproject.javafile.exceltutorial.readexcelfile;

import com.newproject.LoginUser;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadMultiValueFromExcel {
    public List<LoginUser> getDataFromExcel(String filePath, String sheetName) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
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
        List<LoginUser> loginInfo = new ArrayList<>();
        int rowCount = sheet.getLastRowNum();
        for (int r = 1; r <=rowCount ; r++) {
            XSSFRow row = sheet.getRow(r);
            XSSFCell userName = row.getCell(0);
            XSSFCell password = row.getCell(1);
            LoginUser loginUser=new LoginUser(userName.getStringCellValue(), password.getStringCellValue());
            loginInfo.add(loginUser);
        }
        return loginInfo;
    }

    public static void main(String[] args) {
        ReadMultiValueFromExcel readMultiValueFromExcel=new ReadMultiValueFromExcel();
        List<LoginUser> users= readMultiValueFromExcel.getDataFromExcel("Test-Data/MyDoc.xlsx","LoginInfo");
        System.out.println(users);

    }
}