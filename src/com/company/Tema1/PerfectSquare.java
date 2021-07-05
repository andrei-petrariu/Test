package com.company;

import java.util.Scanner;

public class PerfectSquare {
    static boolean checkPerfectSquare(double x) {
        double sq = Math.sqrt(x);
        return  ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args){
        System.out.println("Enter any number:");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();

        if (checkPerfectSquare(num))
            System.out.println(num + "is a perfect square number");
        else
            System.out.println(num + "is not a perfect square number");

    }
}
