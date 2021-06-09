package com.company;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}

