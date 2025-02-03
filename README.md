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
