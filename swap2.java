package main.day5;
import java.util.Scanner;

public class swap2 {
    public static void main(String[] args){

        int x, y, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        x = sc.nextInt();

        System.out.println("Enter the value of Y: ");
        y = sc.nextInt();
        System.out.println("before swapping numbers: "+ x +"  "+ y);

        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping: "+ x +"   " + y);
    }
}



