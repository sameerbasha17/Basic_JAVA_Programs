/* PS : Check Whether or Not the Year is a Leap Year in Java.
Given an integer input for the year, the objective is to check whether or not the user given input “year” is a Leap year or not. */


//Using ternary Operator

import java.util.Scanner;

public class Program07
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        String result = ((year % 400==0)||((year % 4 ==0)&&(year % 100 != 0)))? "leap year": "not a leap year";

        System.out.printf("%d is a %s%n",year,result);

        sc.close();
    }
    
}

/* Output :
 
Case - 01 :
------------
Enter a year : 
1997
1997 is not a leap year.

Case - 02 :
-------------
Enter a year : 
2032
2032 is a leap year

 */
