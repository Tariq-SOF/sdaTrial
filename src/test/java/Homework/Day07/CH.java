package Homework.Day07;

import java.util.Arrays;

public class CH {

    //1. Write a Java Program that reverses a string
//2. Write a Java Program to swap two numbers
//3. Write a Java Program that prints fibonacci number due to given integer (11235811...)
//4. Write a Java Program that checks whether given integer is Prime or not
//5. Write a Java Program that takes an array and returns the difference between the biggest and the smallest numbers.

    public static void main(String[] args) {
        reverseString();
        swapNumbers();
        printFibonacci();
        checkPrime();
        findDifference();
    }

    public static void reverseString() {
        String str = "Hello World";
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println("Reversed string: " + reversed);
    }

    public static void swapNumbers() {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void printFibonacci() {
        int n = 10;
        System.out.println("Fibonacci series up to " + n + " terms:");
        int first = 0, second = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void checkPrime() {
        int num = 29;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }


    public static void findDifference() {
        int[] array = {10, 5, 20, 8, 15};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        int difference = max - min;
        System.out.println("Difference between max and min numbers: " + difference);
    }
}
