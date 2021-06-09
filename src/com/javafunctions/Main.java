package com.javafunctions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*
        A function that accepts inputs
        Having a dynamic output depending on what was inputted in a function
        Write a function to calculate the total cost of a meal
        --Tip = tipRate * listedMealPrice
        --tax = taxRate * listedMealPrice
        --total cost = tip +tax listedMealPrice
         */


    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip +tax;
        System.out.println("Your total meal Price  "  + result);
    }

    public static double calculateTotalMealPriceTwo(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip +tax;
          /*
    split the bill
    return statement allows to take a value of a function and make it available at a different scope
     */
       return  result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java House");
        calculateTotalMealPrice(100, 0.25, 0.8);
        calculateTotalMealPrice(200, 0.15, 0.7);


        double totalMealPrice = calculateTotalMealPriceTwo(100, 0.24, 0.8);
        System.out.println("Group Meal Price " + totalMealPrice);
        double  individualMealPrice = totalMealPrice/4;
        System.out.println("Individual Meal Price " + individualMealPrice);
    }



}
