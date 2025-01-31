package org.mooneiko;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scString.next();

        System.out.println("Hello "+ name);

        System.out.print("Enter your age:");
        String age = scInt.next();

        System.out.println("Your age is:"+age);

        System.out.println("Your name is "+name+" and age is "+age);

        System.out.print("Age you a human? (true/false)");
        boolean isHuman = scInt.nextBoolean();
        if (isHuman) {
            System.out.println("You are a human");
            System.out.println("Your name is "+name+" and age is "+age+" you are a human"+ isHuman);

        }
        else {
            System.out.println("You are not a human");
            System.out.println("Your name is "+name+" and age is "+age+" you are not a human"+ isHuman);

        }

        scString.close();
        scInt.close();
    }
}
