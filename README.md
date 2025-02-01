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
