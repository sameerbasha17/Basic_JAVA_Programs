/* PS :
Check Whether a Given Number is Prime or Not in Java
Given an integer input greater than 0, the objective is to check whether or not the number is a prime. 
To do so, we'll write a code to check whether a given number is prime or not in Java that checks for the factors of the number besides 1 and the number itself.
*/

// Here we use Math.sqrt(number) which is more optimized than number/2.

import java.util.Scanner;

public class Program08 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        checkPrime(number);
        
        sc.close();
    }  
    
    static void checkPrime(int num)
    {
        boolean flag = true;
        
        if(num < 2)
        {
            flag = false;
        }
        else
        {
            for(int i = 2; i <= Math.sqrt(num); i++)
            {
                if(num % i == 0)
                {
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
            System.out.printf("%d is a prime number.%n",num);
        else
            System.out.printf("%d is not a prime number.%n",num);

    }
    
}

/* Output :
 ===========

Case - 1 :
----------
Enter a number : 
9 
9 is not a prime number.

Case - 2 :
----------
Enter a number : 
17
17 is a prime number.

Case - 3 : 
-----------
Enter a number : 
-17
-17 is not a prime number.

Case - 4 :
----------
Enter a number : 
2
2 is a prime number.

 */
