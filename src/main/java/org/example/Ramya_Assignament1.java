package org.example;

public class Ramya_Assignament1 {
    /** Name: Ramya
     *1. Write a short program that prints each number from 1 to 100 on a new line.
     * Date;12-1-23
     */
    public static void main(String[] args)
    {


        for(int i=0; i<=100; i++)
        {
            if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println(("Buzz"));
            }
            else if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(("FizzBuzz"));
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    /*

    public static void main(String[] args)
    {
        String s="rediffmail.com";
        System.out.println(s.contains(".com"));
        System.out.println(s.contains("@"));
        System.out.println(s.equals("rediffmail.com"));
        System.out.println(s.equalsIgnoreCase("Rediffmail.com"));

    }
    public static void main(String[] args)
    {
        String s="rediffmail.com";
        String t="Rediffmail.com";
        // System.out.println(s.substring(2,6));
        System.out.println(s.equals(t));
        System.out.println(s.equalsIgnoreCase(t));
    }
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        // String st="Python Exercise";
        System.out.println("Enter the string :");
        String x= S.
                System.out.println(S.endsWith("se"));

    }
    public static void main(String[] args)
    {
        String s = "Java Exercises!";
        // System.out.println(s.charAt(0));
        System.out.println(s.length());
        //System.out.println(s.charAt(12));
    }
    public static void main(String[] args)
    {
        String s=" Java Selenium";
        System.out.println(s.replace('a','A'));


    }

public class Arraycondition {
    public static void main(String[] args)
    {
        int marks[]=new int[5];
        for(int i=0; i<marks.length;i++)
        {
            marks[i]=i;
            System.out.println(i);
        }

    }
}

public class percentage
 {

    public static void main(String[] args)
    {
        float maths=85;
        float science=92.5f;
        float social=80;
        String s="ramya abbavaram";
        float totalmarks= maths+science+social;
        System.out.println("Total Marks obtained is "+totalmarks);
        float percentage=(totalmarks/300)*100;
        System.out.println("Percentage obtained is "+percentage);
        float differnce= maths-social;
        System.out.println("Diffeence of Maths & social is "+differnce);
        System.out.println(maths>science);
        System.out.println(science>social);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.replace('r','a'));
        String aftersplit=s.split(" ")[1];
        System.out.println(aftersplit);
        System.out.println(s.substring(0,3));
    }
}
*/

}
