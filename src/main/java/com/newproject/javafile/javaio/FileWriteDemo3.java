package com.newproject.javafile.javaio;

public class FileWriteDemo3 {
    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
        String content="Test passed\nhow are you\nGood evening\n";
        fileUtility.fileUtils("Google-Test","Google",content);
        fileUtility.fileUtils("Google-Test-Result","Test-1"," Pass away");
    }
}