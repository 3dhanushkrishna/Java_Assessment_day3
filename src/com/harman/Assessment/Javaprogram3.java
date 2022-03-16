package com.harman.Assessment;

import java.util.Scanner;

public class Javaprogram3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer a,b,sum,diff,avg;
        System.out.println("Enter the two number greater than 10000: ");
        a= input.nextInt();
        b=input.nextInt();
        if (a>10000){
            if(b>10000){
                sum = a+b;
                System.out.println("the sum is: "+sum);
                diff = a-b;
                System.out.println("the difference is: "+diff);
                avg = sum/2;
                System.out.println("the average is: "+avg);
            }
            else {
                System.out.println("Invalid numbers");
            }
        }
    }
}
