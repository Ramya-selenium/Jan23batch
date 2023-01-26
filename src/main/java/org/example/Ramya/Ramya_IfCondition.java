package org.example.Ramya;
import java.util.Scanner;
public class Ramya_IfCondition {


    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.println("Enter Marks of x :");
        float x = S.nextFloat();
// int x = S.nextInt();
        System.out.println("Enter marks of y");
        int y = S.nextInt();
        if (x >= 40 && y >= 40) {
            System.out.println("Both Subjects Passed");
        } else if (x >= 40 && y < 40) {
            System.out.println("Student Passed in X and Failed Y");
        } else if (x < 40 && y >= 40) {
            System.out.println("Student Passed in Y and Failed in X");
        } else {
            System.out.println("Failed in Both Subjects");
        }
    }
}