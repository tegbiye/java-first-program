package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {

    public static final Map<Integer, Float> bestRates = Map.of(1, 0.50f, 2,3.45f, 3,2.67f);

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Enter your name");
        System.out.println("Hello "+name);
        int loanTermInYears = scanner.nextInt();
        float bestRate = getRates(loanTermInYears);

        if(bestRate==0.0f)
        {
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        }
        else
        {
            System.out.println("Best Available Rate: " + bestRate + "%");
        }

        scanner.close();
    }

    public static float getRates(int loanTermInYears)
    {
        if (bestRates.containsKey(loanTermInYears))
        {
            return bestRates.get(loanTermInYears);
        }
        return 0.0f;
    }
}
