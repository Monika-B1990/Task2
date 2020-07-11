package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner (in);
        System.out.println("Enter the number");
        int enterNumber = scanner.nextInt();
        switch(enterNumber){
            case 0:
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println ("Value is correct");
                break;
            case 3:
            case 5:
                System.out.println("Wrong Value entered");
                break;
            default:
                System.out.println("Please enter the valid Number");
                break;
        }
    }
}