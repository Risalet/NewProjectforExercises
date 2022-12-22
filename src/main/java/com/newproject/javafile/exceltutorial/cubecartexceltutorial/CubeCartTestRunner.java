package com.newproject.javafile.exceltutorial.cubecartexceltutorial;

import com.newproject.LoginPage;
import com.newproject.TestBase;

public class CubeCartTestRunner extends TestBase {
    public static void main(String[] args) {
        browserSetUp();
        LoginPage.loginCubeCart();
        AddCustomerPage.addMultiCustomer();
        closeBrowser();
    }

}
