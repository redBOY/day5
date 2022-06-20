package main.day5;

import java.util.Scanner;

public class Leapyear{
    public static void main(String[] args){
        System.out.println("Enter the four digit number year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 && year % 4 == 0){
            System.out.println(" is a leap year");
    }
            else if (year % 100 ==0){
        System.out.println(" is a leap year");
    }
            else{
        System.out.println(" is not a leap year");
    }
}
}
