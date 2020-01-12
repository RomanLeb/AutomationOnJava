package com.softserve.javatraining;
import java.util.ArrayList;

public class App {

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





