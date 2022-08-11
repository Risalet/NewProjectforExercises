package com.newproject.homework;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class ScannerTaxCalculate {
    public static void main(String[] args) {
        double tax = 0;
        String s1 = "Single";
        String m1 = "Married";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you marital status : Married or Single");
        String status = input.nextLine();
        if (status.equalsIgnoreCase(s1)) {
            System.out.println("Please enter your annal income");
            String annalIncome = input.nextLine();
            if (StringUtils.isNumeric(annalIncome)) {
                double AnnalIncome = Integer.parseInt(annalIncome);
                if (AnnalIncome >= 0) {
                    if (AnnalIncome <= 32000) {
                        tax = AnnalIncome * 0.10;
                        System.out.printf("You annal tax is %.2f", tax);
                    }

                    else if (AnnalIncome > 32000) {
                        tax = 32000 * 0.10 + (AnnalIncome - 32000) * 0.25;
                        System.out.printf("You annal tax is %.2f", tax);
                    }
                }
            }

            else {
                System.out.println("Please enter a valid income : You can only enter a 'Number' greater than zero ' ");
            }
        }

        else if (status.equalsIgnoreCase(m1)) {
            System.out.println("Please enter your annal income");
            String annalIncome1 = input.nextLine();
            if (StringUtils.isNumeric(annalIncome1)) {
                double AnnalIncome1 = Integer.parseInt(annalIncome1);
                if (AnnalIncome1 >= 0) {
                    if (AnnalIncome1 <= 64000) {
                        tax = AnnalIncome1 * 0.10;
                        System.out.printf("You annal tax is %.2f", tax);
                    }

                    else if (AnnalIncome1 > 64000) {
                        tax = 64000 * 0.10 + (AnnalIncome1 - 64000) * 0.25;
                        System.out.printf("You annal tax is %.2f", tax);
                    }
                }
            }

            else {
                System.out.println("Please enter a valid income : You can only enter a 'Number' greater than zero ' ");
            }
        }

        else{
            System.out.println("Your can only select 'Married' or 'Single' Not number or another word");
        }
    }
}









