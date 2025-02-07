# JavaCorePractice 🚀

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)
![GitHub Stars](https://img.shields.io/github/stars/firemoraster/JavaCorePractice?style=for-the-badge)
![GitHub Forks](https://img.shields.io/github/forks/firemoraster/JavaCorePractice?style=for-the-badge)
![GitHub Issues](https://img.shields.io/github/issues/firemoraster/JavaCorePractice?style=for-the-badge)

Welcome to **JavaCorePractice**! This repository is dedicated to practicing and mastering the core concepts of Java programming. Whether you're a beginner or looking to refresh your skills, this repo is for you. Today, I started with **Variables** – one of the fundamental building blocks of Java.

---


## 📑 Table of Contents

- [1. Variables](#1-variables)
- [2. User Input (Scanner)](#2-user-input-scanner)
  - [2.1 Mad Libs Game (Using Scanner)](#21-mad-libs-game-using-scanner)
- [3. Arithmetic](#3-arithmetic)
  - [3.1 Shopping Cart Program](#31-shopping-cart-program)
- [4. If Statements](#4-if-statements)
- [5. Random Numbers](#5-random-numbers)
- [6. Math Class](#6-math-class)
- [7. Printf](#7-printf)
  - [7.1 Compound Interest Calculator](#71-compound-interest-calculator)






## 📚 Topics Covered

### 1. Variables
- **What are Variables?**
  - Variables are containers for storing data values in Java.
  - They have a type, name, and value.
- **Types of Variables:**
  - **Primitive Types:** `int`, `double`, `char`, `boolean`, etc.
  - **Reference Types:** `String`, `Arrays`, `Objects`, etc.
- **Variable Declaration and Initialization:**
  ```java
  int age = 25; // Declaring and initializing an integer variable
  String name = "John"; // Declaring and initializing a String variable

### 2. User Input (Scanner)
- **What is Scanner?**
  - The `Scanner` class is used to read input from the user.
  - It is part of the `java.util` package.
- **How to Use Scanner:**
  - Import the `Scanner` class: `import java.util.Scanner;`
  - Create a `Scanner` object: `Scanner scanner = new Scanner(System.in);`
  - Use methods like `nextInt()`, `nextDouble()`, `nextLine()`, etc., to read input.
- **Example:**
  ```java
  import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter your name: ");
          String name = scanner.nextLine();

          System.out.print("Enter your age: ");
          int age = scanner.nextInt();

          System.out.println("Hello, " + name + "! You are " + age + " years old.");

          scanner.close(); // Always close the scanner to avoid resource leaks
      }
  }
  ```
### 2.1 Mad Libs Game (Using Scanner)
- **What is the Mad Libs Game?**
  - Mad Libs is a word game where users provide random words to fill in the blanks in a story.
  - It helps practice string input handling in Java.

- **Example Code:**
  ```java
  import java.util.Scanner;

  public class MadLibs {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter an adjective: ");
          String adjective = scanner.nextLine();

          System.out.print("Enter a noun: ");
          String noun = scanner.nextLine();

          System.out.print("Enter a verb: ");
          String verb = scanner.nextLine();

          System.out.println("\nHere is your Mad Libs story:");
          System.out.println("Once upon a time, there was a " + adjective + " " + noun + " who loved to " + verb + ".");

          scanner.close(); // Always close the scanner to avoid resource leaks
      }
  }

### 3. Arithmetic
- **Arithmetic Operations in Java:**
  - Java supports basic arithmetic operations such as addition (`+`), subtraction (`-`), multiplication (`*`), division (`/`), and modulus (`%`).
- **Examples of Arithmetic Operations:**
  ```java
  package org.mooneiko;

  public class Arithmetic {
      public static void main(String[] args) {
          // Basic Arithmetic Operations
          int x = 10;
          int y = 2;
          int z;

          // Addition
          z = x + y;
          System.out.println("Addition: " + z);

          // Subtraction
          z = x - y;
          System.out.println("Subtraction: " + z);

          // Multiplication
          z = x * y;
          System.out.println("Multiplication: " + z);

          // Division
          z = x / y;
          System.out.println("Division: " + z);

          // Modulus
          z = x % y;
          System.out.println("Modulus: " + z);

          // Augmented Assignment Operators
          x = 10; // reset x
          System.out.println("\nUsing Augmented Assignment Operators:");
          x += y; // x = x + y
          System.out.println("x += y: " + x);

          x = 10; // reset x
          x -= y; // x = x - y
          System.out.println("x -= y: " + x);

          x = 10; // reset x
          x *= y; // x = x * y
          System.out.println("x *= y: " + x);

          x = 10; // reset x
          x /= y; // x = x / y
          System.out.println("x /= y: " + x);

          x = 10; // reset x
          x %= y; // x = x % y
          System.out.println("x %= y: " + x);

          // Increment and Decrement Operators
          int a = 1;
          System.out.println("\nIncrement Operators:");
          System.out.println("Initial a: " + a);
          a++; // Post-increment
          System.out.println("a++: " + a);
          ++a; // Pre-increment
          System.out.println("++a: " + a);

          int b = 3;
          System.out.println("\nDecrement Operators:");
          System.out.println("Initial b: " + b);
          b--; // Post-decrement
          System.out.println("b--: " + b);
          --b; // Pre-decrement
          System.out.println("--b: " + b);

          // Order of operations (PEMDAS: Parentheses, Exponents, Multiplication/Division, Addition/Subtraction)
          double result = 3 + 4 * (7 - 5) / 2.0;
          System.out.println("\nResult of Order of Operations (PEMDAS): " + result);
      }
  }
  ```

  ### 3.1 Shopping Cart Program
- **What is the Shopping Cart Program?**
  - This program simulates a simple shopping cart where users can input the item they want to buy, its price, and the quantity. The program then calculates the total cost and displays the result.
  - It helps practice user input handling, arithmetic operations, and string formatting in Java.

- **How It Works:**
  1. The program uses the `Scanner` class to take user input for the item name, price, and quantity.
  2. It calculates the total cost by multiplying the price by the quantity.
  3. Finally, it displays the item details and the total cost in a user-friendly format.

- **Code Example:**
  ```java
  import java.util.Scanner;

  public class ShoppingCart {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          String item;
          double price;
          int quantity;
          char currency = '$';
          double total;

          System.out.print("What item would you like to buy? ");
          item = sc.nextLine();

          System.out.print("What is the price for each?: ");
          price = sc.nextDouble();

          System.out.print("How many items would you like to buy? ");
          quantity = sc.nextInt();

          total = price * quantity;

          System.out.print("\n");
          System.out.print("\n You have bought " + quantity + " items of " + item + "");
          System.out.print("\n Your total is " + currency + total);

          sc.close();
      }
  }




### 4. If Statements
- **What are If Statements?**
  - If statements are used to perform a block of code only if a specified condition is true.
  - They allow programs to make decisions based on certain criteria.
  - You can also use `else if` and `else` to handle multiple conditions.

- **How It Works:**
  1. The program uses the `Scanner` class to take user input for their name, age, and student status.
  2. It uses **if statements** to check:
     - If the name is empty.
     - The age group of the user (child, adult, senior, etc.).
     - Whether the user is a student or not.
  3. Based on the conditions, it displays appropriate messages.

- **Code Example:**
  ```java
  import java.util.Scanner;

  public class IfStatements {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          String name;
          int age;
          boolean isStudent;

          System.out.print("Enter your name: ");
          name = sc.nextLine();

          System.out.print("Enter your age: ");
          age = sc.nextInt();

          System.out.print("Are you a student? (true/false): ");
          isStudent = sc.nextBoolean();

          // Group 1: Check if name is empty
          if (name.isEmpty()) {
              System.out.println("Name is empty");
          } else {
              System.out.println("Name is " + name);
          }

          // Group 2: Check age group
          if (age >= 65) {
              System.out.println("You are a senior!");
          } else if (age >= 18) {
              System.out.println("You are an adult!");
          } else if (age < 0) {
              System.out.println("You haven't been born yet!");
          } else if (age == 0) {
              System.out.println("You are a baby!");
          } else {
              System.out.println("You are a child!");
          }

          // Group 3: Check student status
          if (isStudent) {
              System.out.println("You are a student!");
          } else {
              System.out.println("You are not a student!");
          }

          sc.close();
      }
  }

### 5. Random Numbers
- **What are Random Numbers?**
  - Random numbers are used to generate unpredictable values in a program.
  - In Java, the `Random` class from the `java.util` package is used to generate random numbers.
  - You can generate random integers, doubles, and booleans using this class.

- **How It Works:**
  1. The program creates an instance of the `Random` class.
  2. It generates random integers within a specified range using `nextInt()`.
  3. It generates random doubles using `nextDouble()`.
  4. It generates random booleans using `nextBoolean()`.

- **Code Example:**
  ```java
  import java.util.Random;

  public class RandomNumbers {
      public static void main(String[] args) {
          Random rand = new Random();

          int number;
          int number1;
          int number2;
          int number3;
          double number4;
          boolean flag;

          // Generate random integers
          number = rand.nextInt(1, 6); // Random number between 1 and 5 (inclusive)
          number1 = rand.nextInt(1, 101); // Random number between 1 and 100
          number2 = rand.nextInt(1, 101); // Random number between 1 and 100
          number3 = rand.nextInt(1, 101); // Random number between 1 and 100

          // Generate random double
          number4 = rand.nextDouble(1, 101); // Random double between 1.0 and 100.0

          // Generate random boolean
          flag = rand.nextBoolean(); // Random boolean (true or false)

          // Display the results
          System.out.println("Random number (1-5): " + number);
          System.out.println("Random number (1-100): " + number1);
          System.out.println("Random number (1-100): " + number2);
          System.out.println("Random number (1-100): " + number3);
          System.out.println("Random double (1.0-100.0): " + number4);
          System.out.println("Random boolean: " + flag);
      }
  }

### 6. Math Class

- **What is the Math Class?**
  - The `Math` class in Java provides a collection of static methods and constants to perform common mathematical operations. It includes constants such as `Math.PI` and `Math.E`, and methods for exponentiation, square roots, rounding, and more.

- **Key Methods of the Math Class:**
  1. **`Math.pow(a, b)`**  
     - Raises `a` to the power of `b`.
  2. **`Math.abs(x)`**  
     - Returns the absolute value of `x`.
  3. **`Math.sqrt(x)`**  
     - Computes the square root of `x`.
  4. **`Math.round(x)`**  
     - Rounds `x` to the nearest integer.
  5. **`Math.ceil(x)`**  
     - Rounds `x` upward to the nearest whole number.
  6. **`Math.floor(x)`**  
     - Rounds `x` downward to the nearest whole number.
  7. **`Math.max(x, y)`**  
     - Returns the larger of two values.
  8. **`Math.min(x, y)`**  
     - Returns the smaller of two values.

- **Practical Examples:**
  - **Basic Operations:**  
    The code demonstrates how to calculate powers, absolute values, square roots, and perform various rounding operations.
  - **Hypotenuse Calculation:**  
    Using the Pythagorean theorem (`c = Math.sqrt(a^2 + b^2)`), the program calculates the hypotenuse of a right-angled triangle based on user input.
  - **Circle and Sphere Calculations:**  
    The code computes:
    - **Circumference:** `circumference = 2 * Math.PI * radius`
    - **Area of a Circle:** `area = Math.PI * Math.pow(radius, 2)`
    - **Volume of a Sphere:** `volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)`

- **Code Example:**
  ```java
  import java.util.Scanner;

  public class MathExamples {
      public static void main(String[] args) {
          // Displaying Math constants
          System.out.println("Value of PI: " + Math.PI);
          System.out.print("Value of E: " + Math.E);
          
          Scanner sc = new Scanner(System.in);
          double result;
          double a, b, c;

          // Using various Math methods
          result = Math.pow(2, 3);
          System.out.println("\n2^3 = " + result);
          
          result = Math.abs(-5);
          System.out.println("Absolute value of -5: " + result);
          
          result = Math.sqrt(9);
          System.out.println("Square root of 9: " + result);
          
          result = Math.round(3.14);
          System.out.println("3.14 rounded: " + result);
          
          result = Math.ceil(3.14);
          System.out.println("Ceiling of 3.14: " + result);
          
          result = Math.floor(3.99);
          System.out.println("Floor of 3.99: " + result);
          
          result = Math.max(10, 20);
          System.out.println("Maximum of 10 and 20: " + result);
          
          result = Math.min(10, 20);
          System.out.println("Minimum of 10 and 20: " + result);

          // Calculate the hypotenuse using the Pythagorean theorem
          System.out.print("\nEnter the length of side A: ");
          a = sc.nextDouble();
          System.out.print("Enter the length of side B: ");
          b = sc.nextDouble();
          c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
          System.out.println("Hypotenuse of " + a + " and " + b + " is " + c);

          // Calculate circumference, area, and volume for a circle/sphere
          double radius, circumference, area, volume;
          System.out.print("\nEnter the radius: ");
          radius = sc.nextDouble();
          
          // Circumference = 2 * PI * radius
          circumference = 2 * radius * Math.PI;
          System.out.printf("Circumference of circle with radius %.1f is %.1f cm\n", radius, circumference);
          
          // Area = PI * radius^2
          area = Math.PI * Math.pow(radius, 2);
          System.out.printf("Area of circle with radius %.1f is %.1f cm²\n", radius, area);
          
          // Volume = (4/3) * PI * radius^3
          volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
          System.out.printf("Volume of sphere with radius %.1f is %.1f cm³", radius, volume);
          
          sc.close();
      }
  }


### 7. Printf
- **What is `printf()`?**
  - `printf()` is a method used to format output in Java.
  - It allows you to control the display of strings, numbers, and other data types using **format specifiers**.
  - The syntax for format specifiers is: `%[flags][width][.precision][specifier-character]`.

- **How It Works:**
  1. The program uses `printf()` to format and display variables like strings, characters, integers, doubles, and booleans.
  2. It demonstrates the use of **flags**, **width**, **precision**, and **specifiers** to control the output format.
  3. It also shows how to format numbers with commas, zero-padding, and alignment.

- **Code Example:**
  ```java
  public class PrintfExample {
      public static void main(String[] args) {
          // Variables
          String name = "Spongebob";
          char firstLetter = 'S';
          int age = 30;
          double height = 60.5;
          boolean isEmployed = true;

          // Basic printf examples
          System.out.printf("Hello %s\n", name); // String
          System.out.printf("Your name starts with a %c\n", firstLetter); // Character
          System.out.printf("Your age is %d\n", age); // Integer
          System.out.printf("Your height is %.2f\n", height); // Double with 2 decimal places
          System.out.printf("Your isEmployed is %b\n", isEmployed); // Boolean
          System.out.printf("%s is %d years old\n", name, age); // Multiple variables

          // Formatting numbers with flags
          double price1 = 9.99;
          double price2 = 100.15;
          double price3 = -54.01;

          System.out.println("+ flag:");
          System.out.printf("%+.2f\n", price1); // Plus sign for positive numbers
          System.out.printf("%+.2f\n", price2);
          System.out.printf("%+.2f\n", price3);

          System.out.println("Space flag:");
          System.out.printf("% .2f\n", price1); // Space for positive numbers
          System.out.printf("% .2f\n", price2);
          System.out.printf("% .2f\n", price3);

          System.out.println(", flag (comma grouping):");
          price1 = 9000.99;
          price2 = 100000.15;
          price3 = -54000.01;
          System.out.printf("%,.2f\n", price1); // Comma as a thousand separator
          System.out.printf("%,.2f\n", price2);
          System.out.printf("%,.2f\n", price3);

          // Zero padding and width
          int id1 = 1;
          int id2 = 23;
          int id3 = 456;
          int id4 = 7890;

          System.out.println("Zero padding:");
          System.out.printf("%04d\n", id1); // Zero-padded to 4 digits
          System.out.printf("%04d\n", id2);
          System.out.printf("%04d\n", id3);
          System.out.printf("%04d\n", id4);

          System.out.println("Spaces (right-aligned):");
          System.out.printf("%4d\n", id1); // Right-aligned in 4 spaces
          System.out.printf("%4d\n", id2);
          System.out.printf("%4d\n", id3);
          System.out.printf("%4d\n", id4);

          System.out.println("Spaces (left-aligned):");
          System.out.printf("%-4d\n", id1); // Left-aligned in 4 spaces
          System.out.printf("%-4d\n", id2);
          System.out.printf("%-4d\n", id3);
          System.out.printf("%-4d\n", id4);
      }
  }


### 7.1 Compound Interest Calculator
- **What is a Compound Interest Calculator?**
  - A compound interest calculator calculates the future value of an investment based on the principal amount, interest rate, number of times interest is compounded per year, and the number of years.
  - The formula used is:  
    **A = P × (1 + r/n)^(n×t)**  
    Where:
    - **A** = the future value of the investment
    - **P** = the principal amount
    - **r** = annual interest rate (in decimal)
    - **n** = number of times interest is compounded per year
    - **t** = number of years

- **How It Works:**
  1. The program uses the `Scanner` class to take user input for the principal amount, interest rate, compounding frequency, and investment duration.
  2. It calculates the future value using the compound interest formula.
  3. It displays the result using `printf()` for formatted output.

- **Code Example:**
  ```java
  import java.util.Scanner;

  public class CompoundInterestCalculator {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          double principal;
          double rate;
          int timesCompounded;
          int years;
          double amount;

          // User input
          System.out.print("Enter the principal amount you would like to deposit: ");
          principal = sc.nextDouble();

          System.out.print("Enter the interest rate (in %): ");
          rate = sc.nextDouble() / 100; // Convert percentage to decimal

          System.out.print("Enter the number of times compounded per year: ");
          timesCompounded = sc.nextInt();

          System.out.print("Enter the number of years: ");
          years = sc.nextInt();

          // Calculate compound interest
          amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

          // Display the result
          System.out.printf("The amount after %d years is %.2f", years, amount);

          sc.close();
      }
  }
