package com.harman.Assessment;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        float x,y;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Fahrenheit: ");
        x=input.nextFloat();
        y=((x-32)*5)/9;
        System.out.println("Temperature in Celsius: "+y);

    }
}
