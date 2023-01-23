package org.example;
import java.util.Scanner;
public class Swapping {
public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first numbar " );
    int x= scan.nextInt();
    System.out.println("Enter Second number ");
    int y=scan.nextInt();
    int z=scan.nextInt();
    x=z;
    z=y;
    System.out.println(("After swapping first number is" +x));
    System.out.println("Second one is "+y);

}
}