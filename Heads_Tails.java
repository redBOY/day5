package main.day5;

import java.util.Scanner;

public class Heads_Tails {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your flips");
        int flip = Sc.nextInt();
        for (int i = 1; i <= flip; i++)
            System.out.println(flip + "i");
    }

}


