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
        System.out.println("Enter the initial number : ");
        int start = sc.nextInt();
        System.out.println("Enter the final number :");
        int end = sc.nextInt();

        Program09 obj = new Program09();
        obj.printPrime(start,end);
        
        sc.close();
    }

    void printPrime (int start, int end)
    {
        System.out.printf("The prime numbers between %d and %d are : ",start,end);

        for(int i = start ; i <= end ; i++)
        {
            boolean flag = true;
            if(i < 2 )
                continue;

            for(int j =2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(i+" ");
            }
        }
    }
}

/* Output :
 
Case - 1 :
------------
Enter the initial number : 
2
Enter the final number :
7
2 3 5 7 

 */