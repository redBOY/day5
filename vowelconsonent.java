package main.day5;

import java.util.Scanner;
public class vowelconsonent {
    public static void  main(String[] args){

        System.out.println("Enter your Alphabet: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            System.out.println("alphabet is an vowel");
        }else{
            System.out.println("Alphabet is a consonant");
        }

    }
}


