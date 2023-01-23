package org.example;
import java.util.Scanner;
public class operators {
    /*addition and subtraction
    Author: Ramya, date: 11/1/23, Operators
     */
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first number x");
int x=scan.nextInt();
System.out.println("Enter Second number y");
int y=scan.nextInt();
int sum = x+y;
int diff=y-x;
System.out.println("Addition of two numbers is " +sum);
System.out.println("Difference of two numbers " +diff);
    }
}
