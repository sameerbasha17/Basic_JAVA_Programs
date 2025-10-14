/* Check Whether or Not the Year is a Leap Year in Java
Given an integer input for the year, the objective is to check whether or not the user given input “year” is a Leap year or not.  */

// Using if-else statement

import java.util.Scanner;

public class Program07 
{
    public static void main(String [] args )
    {
        System.out.println("Enter a year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if((year % 400 == 0) || ((year % 4 == 0)&&(year % 100 != 0)))
        {
            System.out.printf("%d is a leap year.%n",year);
        }

        else
        {
            System.out.printf("%d is not a leap year.%n",year);
        }

        sc.close();
    }
    
}

/* Output :
 
Case - 01 :
------------
Enter a year : 
2024
2024 is a leap year.

Case - 02 :
-------------
Enter a year : 
1997
1997 is not a leap year.

 */
