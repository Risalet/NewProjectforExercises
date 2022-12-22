package com.newproject.javafile.exceltutorial.readexcelfile;

import com.newproject.LoginPage;
import com.newproject.LoginUser;
import com.newproject.TestBase;
import com.newproject.cubecartproject.DashBordPage;
import java.util.List;

public class RoleBaseSecurityTest extends TestBase {
    public static void main(String[] args) {
        ReadMultiValueFromExcel readMultiValueFromExcel=new ReadMultiValueFromExcel();
        LoginPage loginPage=new LoginPage();
        DashBordPage dashBordPage=new DashBordPage();
        List<LoginUser> users= readMultiValueFromExcel.getDataFromExcel("Test-Data/MyDoc.xlsx","LoginInfo");
        browserSetUp();
        for (LoginUser user: users) {
            LoginPage.login(user.getUserName(),user.getPassword());
            dashBordPage.logout();
        }
        closeBrowser();
    }
}
