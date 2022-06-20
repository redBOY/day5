package main.day5;

import java.util.Scanner;
public class harmonic {
    public static void main(String[] args) {

        double n,j;
        double sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        n=sc.nextDouble();

        for(  j = 1; j <= n ; j++)
        {
            sum=sum+(1/j);
        }
        System.out.println("Harmonic value = "+ sum);

    }
}


