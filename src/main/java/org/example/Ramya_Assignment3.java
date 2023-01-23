package org.example;

public class Ramya_Assignment3 {
    /**
     * Name: Ramya
     * 3. Write a Java program to concatenate a given string to the end of another string
     * Sample Output:
     * String 1: PHP Exercises and
     * String 2: Python Exercises
     * The concatenated string: PHP Exercises and Python Exercises
          */
    public static void main(String[] args)
    {
        String x ="PHP Exercises and ";
        System.out.println(x);

        String y = "Python Exercises";
        System.out.println(y);
        System.out.println("After concatination " +x.concat(y));
    }
}
