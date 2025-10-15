/* PS :
Check Whether a Given Number is Prime or Not in Java
Given an integer input greater than 0, the objective is to check whether or not the number is a prime. 
To do so, we'll write a code to check whether a given number is prime or not in Java that checks for the factors of the number besides 1 and the number itself.
*/

import java.util.Scanner;

public class Program08 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        prime(number);
        
        sc.close();
    }
    
    public static void prime(int number)
    {
        int count =0;
        if(number < 2)
        {
            count = 1;
        }
        else
        {
            for (int i = 2; i <= number/2 ; i++)
            {
                
                if(number % i == 0) 
                {
                    count ++;
                    break;
                }
            }
            
        }

        String result = (count > 0)? "is not a prime" : "is a prime";
        System.out.printf("%d is a %s number.%n",number,result);

        
    }
}

/* Output :
 
Case - 01 :
-----------
Enter a number : 
9
9 is a is not a prime number.

Case - 02 :
------------
Enter a number : 
17
17 is a is a prime number.

Case - 03 :
------------
Enter a number : 
-17
-17 is a is not a prime number.

 */
