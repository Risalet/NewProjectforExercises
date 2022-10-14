package com.newproject.cubecartproject;



public class CubecartTestRunner {
    public static void main(String[] args) {
        FunctionLibrary functionLibrary=new FunctionLibrary();
        functionLibrary.openBrowser(" http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        LoginUser loginUser=new LoginUser("testautomation1","automation123!");
        System.out.println(loginUser.toString());
        functionLibrary.login(loginUser);
        Product addProduct=new Product(true,"Selenium Test Automation","New","Test-123456");
        functionLibrary.addProduct(addProduct);
        System.out.println(addProduct.toString());
        functionLibrary.logout();
        functionLibrary.tearDown();

    }
}
