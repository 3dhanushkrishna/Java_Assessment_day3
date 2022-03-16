package com.harman.Assessment;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year of birth: ");
        int year = input.nextInt();
        String x;
        x = (year % 4 == 0 && year % 100 != 0)?"It is a leap year":"It is not a leap year";
        System.out.println(x);

    }
}
