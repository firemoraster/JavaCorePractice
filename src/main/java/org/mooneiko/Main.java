package org.mooneiko;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // simple println
        System.out.print("it's really good!\n"); // print with \n as new line
        /*
        System.out.print("Let's create a new world together!");
        multi-line comment
         */
        System.out.println("it's really good!");


        // integer variable  - simple one line comment

        //declaration
        int quantity = 21;
        int value = 100;
        System.out.println("The value is "+ value);

        // double variable
        double price = 19.99;
        double gpa = 3.5;
        double temperatur = -2.3;

        System.out.println("$"+price);

        // char variable

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println("The grade is "+ grade);

        // boolean variable

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent +"\n"+forSale +"\n"+isOnline);

        // condition statement

        if(isStudent)
        {System.out.println("You are a Student");}
        else {
            System.out.println("You are not a Student");
        }
    }
}