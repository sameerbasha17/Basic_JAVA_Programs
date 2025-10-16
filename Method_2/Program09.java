/* PS :
Find all the Prime Numbers in a Given Interval in Java

Given two integer inputs for the range or the interval for the search. The objective is to search and find all the Prime Numbers that lay in the given interval or range. 
To do so we'll iterate through the numbers and check whether or not they are prime simultaneously.

 */

import java.util.Scanner;

public class Program09 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial number in the range : ");
        int initial = sc.nextInt();
        System.out.println("Enter the last number in the range : ");
        int last = sc.nextInt();

        printPrime(initial,last);

        sc.close();

    }  

    static void printPrime(int initial,int last)
    {
        boolean hasPrime = false;
        System.out.printf("The prime numbers between %d and %d are : ",initial,last);
        for( int i = initial; i <= last; i++)
        {
            boolean flag = true;

            if(i < 2)
                continue;

            for(int j = 2;j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(i + " ");
                hasPrime = true;
            }
        }

        if(!hasPrime)
        {
            System.out.printf("There are no prime numbers between %d and %d !", initial,last);
        }
    }
}

/* Output :
============
Case - 1 :
-----------
Enter the initial number in the range : 
24
Enter the last number in the range : 
56
The prime numbers between 24 and 56 are : 29 31 37 41 43 47 53 

Case -2 :
-----------
Enter the initial number in the range : 
-24
Enter the last number in the range : 
0
The prime numbers between -24 and 0 are : There are no prime numbers between -24 and 0 !

 */