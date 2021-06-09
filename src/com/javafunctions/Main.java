package com.javafunctions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

public  static  void announceTeaTime(){
    //these are the lines of code to be executed when the function is used
    System.out.println("Awaiting for the announcement......");
    System.out.println("Type in a random word and press enter to start the developer tea-time ");
    Scanner scanner = new Scanner(System.in);
    scanner.next();
    System.out.println("It is developer Tea Time");
}
    public static void main(String[] args) {
	/*
        differentiate between definition and usage
         */
        System.out.println("Welcome to your new Job");

        announceTeaTime();

        System.out.println("Write code");
        System.out.println("Review Code");

        announceTeaTime();
        System.out.println("Get Promoted");

    }
}
