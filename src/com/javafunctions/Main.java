package com.javafunctions;

        /*
        create a function to calculate the employees salary
        given how many hours a person works per week and how much a person makes per hour
        inputs [hours/week pay/hour]
        output: employees gross yearly salary
        Bonus - add an input that accounts for the vacation days and the
        employee does not get paid on vacation days
         */

public class Main {

    public  static  double calculateSalary(double hoursPerWeek, double amountPerHour, int vacationDays){
        if(hoursPerWeek < 1 || amountPerHour <1) {
            return  -1;
        }
        double weeklyPayCheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays *amountPerHour *8;

        return  (weeklyPayCheck *52)-unpaidTime;
    }


    public static void main(String[] args) {

       double salary = calculateSalary(0,15, 8);
        System.out.println(salary);

    }


}
