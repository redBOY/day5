package main.day5;

import java.util.Scanner;
public class remainder {
    public static void main(String[] args){

        System.out.println("Enter your first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter your Second number: ");
        int num2 = sc.nextInt();

        int quotient = 0, remainder = 0;

        quotient = (num1 / num2 )- remainder;
        remainder = num1 - num2 * quotient;

        System.out.println("Quotient " + "is: " + quotient);
        System.out.println("Remainder " + " is: " + remainder);
    }
}

