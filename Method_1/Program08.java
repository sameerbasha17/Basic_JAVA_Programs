/* PS :
Check Whether a Given Number is Prime or Not in Java
Given an integer input greater than 0, the objective is to check whether or not the number is a prime. 
To do so, we'll write a code to check whether a given number is prime or not in Java that checks for the factors of the number besides 1 and the number itself.
*/

import java.util.Scanner;

public class Program08 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        boolean flag = true;
        if(number < 2)
        {
           flag = false;
        }
        else
        {
            
            for(int i = 2;i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
        {
            System.out.printf("%d is a prime number.%n",number);
        }
        else
        {
            System.out.printf("%d is not a prime number.%n",number);
        }
        

        sc.close();
    }
    
}

/* Output : 
 
Case - 01 :
------------
Enter a number(Greater than 0) :
9
9 is not a prime number.

Case - 02 :
------------
Enter a number(Greater than 0) :
7
7 is a prime number.

Case- 03 :
-------------
Enter a number :
-917
-917 is not a prime number.

*/
