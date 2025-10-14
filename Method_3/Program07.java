/* PS : Check Whether or Not the Year is a Leap Year in Java.
Given an integer input for the year, the objective is to check whether or not the user given input “year” is a Leap year or not. */



// Bonus Boolean Method

import java.util.Scanner;

public class Program07 
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        boolean flag = false;
        if(year % 400 ==0)
        {
            flag = true;
        }
        if(year % 400 == 0 || year % 4 == 0 && year%100 !=0 )
        {
            flag = true;
        }
        if(flag)
            System.out.printf("%d is a leap year.%n",year);
        else
            System.out.printf("%d is not a leap year.%n",year);
        
        sc.close();
    }
    
}

/* Output :

Case - 01 :
------------
Enter a year : 
2006
2006 is not a leap year.

Case - 02 :
------------
Enter a year : 
2016
2016 is a leap year.

 */