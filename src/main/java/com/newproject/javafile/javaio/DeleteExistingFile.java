package com.newproject.javafile.javaio;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class DeleteExistingFile {
    public static void main(String[] args) {
        //delete existing file
       boolean isFileDeleted=
               FileUtils.deleteQuietly(new File("Google-Test-Result"+File.separator+"Test-11667001775492.txt"));
        System.out.println("File is delete "+isFileDeleted);

        boolean isFolderDelete= FileUtils.deleteQuietly(new File("Google-Test-Result"));
        System.out.println("Folder is deleted "+ isFolderDelete);
    }
}
