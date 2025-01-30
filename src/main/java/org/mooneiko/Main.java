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

        Variables variables = new Variables();

        System.out.println("The value is " + variables.value);
        System.out.println("$" + variables.price);
        System.out.println("The grade is " + variables.grade);
        System.out.println(variables.isStudent + "\n" + variables.forSale + "\n" + variables.isOnline);

        if (variables.isStudent) {
            System.out.println("You are a Student");
        } else {
            System.out.println("You are not a Student");

        }

    }
}
