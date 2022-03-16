package com.harman.Assessment;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x,root;
        System.out.println("Enter the number: ");
        x=input.nextInt();
        root=java.lang.Math.sqrt(x);
        System.out.println(root);
    }
}
