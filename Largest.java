package main.day5;

import java.util.Scanner;
public class Largest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: a = ");
        int a = sc.nextInt();

        System.out.println("Enter your first number: b = ");
        int b = sc.nextInt();

        System.out.println("Enter your first number: c = ");
        int c = sc.nextInt();

        if(a>b && a>c) {
            System.out.println("First number is the largest: " + a);
        }else if  (b>a && b>c){
            System.out.println("second number is the largest: " + b);
        }
        else{
            System.out.println("third number is the largest: " + c);
        }
    }
}


