/* PS : Find the Sum of the Digits of a Number in Java.
Given an integer input number, the objective is t0 Find the Sum of the Digits of a Number in Java Language. */

// Handles even if input is negative.


import java.util.Scanner;

public class Program10 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        number = Math.abs(number);   // Takes only magnitude, ignores the sign of the number(always number is treated as positive).

        System.out.println("The sum of digits in " + number + " is : " + getSum(number));   // print the output

        sc.close();
    }    

    static int getSum(int num)
    {
        int sum = 0 , rem = 0;
        while(num != 0)
        {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum; // returns the sum value to the calling function
    }
}

/* Output :
===========
Case - 01 :
-----------
Enter a number :
134
The sum of digits in 134 is : 8

Case - 02 :
-----------
Enter a number :
-134
The sum of digits in 134 is : 8

 */