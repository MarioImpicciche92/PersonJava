package io;

import java.util.Scanner;

public class CharacterApp {

    public static void main(String[] args) {
       Scanner inputUser = new Scanner(System.in);
        
       System.out.println("Welcome int the charm World");
       System.out.println("The new character is: ");

       System.out.println("Name : ");

       String name = inputUser.nextLine();
       
       System.out.println("The character is (orc or human)");
       while(!inputUser.hasNext("orc") && !inputUser.hasNext("human")){
        System.err.println("Invalid character");
        inputUser.nextLine();

        
       }
       String test = inputUser.nextLine();

       System.out.println("Difficuly (0 - easy, 1 - medium , 2 - hard)");
       while(!inputUser.hasNextByte(3)){
        System.err.println("Invalid input , you need type 0 or 1 or 2");
        inputUser.nextLine();
       }
    }
}
