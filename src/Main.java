// Going through https://www.w3resource.com/java-exercises/basic/index.php 

import java.util.Scanner;

class Hello_World {

    public static void main (String[] args) {
        // Hello World
        System.out.println("Hello, World!\n");
        // Exercise 1 - Write a Java program to print 'Hello' on screen and your name on a separate line.
        System.out.println("Hello \nAlexandra Abramov\n");
        // Exercise 2 - Write a Java program to print the sum of two numbers
        System.out.println(74+36+ "\n");
        // Exercise 3 - Write a Java program to divide two numbers and print them on the screen.
        System.out.println(50/3);
        // Exercise 4 - Write a Java program to print the results of the following operations.
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3+ "\n");
        // Exercise 5 - Write a Java program that takes two numbers as input and displays the product of two numbers.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first_number = in.nextInt();
        System.out.println("Enter the second number: ");
        int second_number = in.nextInt();
        System.out.println(first_number +" * "+ second_number + " = " + second_number * first_number);
         */
        // Exercise 6 - Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.println(num1 +" + "+ num2 + " = " + (num1+num2));
        System.out.println(num1 +" - "+ num2 + " = " + (num1 -num2));
        System.out.println(num1 +" * "+ num2 + " = " + (num1 * num2));
        System.out.println(num1 +" / "+ num2 + " = " + (num1 / num2));
        System.out.println(num1 +" mod "+ num2 + " = " + (num1 % num2));
    }
}