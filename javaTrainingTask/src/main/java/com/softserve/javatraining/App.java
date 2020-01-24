package com.softserve.javatraining;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int minimalSqr = 0;
        int count = 0;
        if (args.length < 2) {
            Scanner input = new Scanner((System.in));
            System.out.println("Interactive mode set, as no command line parameters were provided");
            System.out.println("Enter minimal square");
            minimalSqr = input.nextInt();
            System.out.println("Enter numbers count");
            count = input.nextInt();

        } else {
            minimalSqr = Integer.valueOf(args[0]);
            count = Integer.valueOf(args[1]);
        }
        System.out.printf("Result for Minimal squr:%d, and count:%d is:", minimalSqr, count);
        System.out.println(getNumbersListBasedOnSqrFunction(minimalSqr, count));
    }

    public static ArrayList<Integer> getNumbersListBasedOnSqrFunction(int minimalSqr, int numbersCount) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        if (minimalSqr < 1 || numbersCount < 1) {
            throw new IllegalArgumentException("Arguments can not be less than 1");
        }
        int i = 1;
        do {
            if (i * i > minimalSqr) numbersList.add(i);
            i++;
        } while (numbersList.size() < numbersCount);
        return numbersList;
    }
}





