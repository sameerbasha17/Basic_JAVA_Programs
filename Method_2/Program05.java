/* Find the Greatest of the Two Numbers in Java.
Given two integer input Number1 and Number2, the objective is to write a Java code to compare both the Numbers and Find the Greatest of the Two Numbers. 
To do so we’ll use if-else statements and print the output. */

// Method-2 : Ternary Operator

import java.util.Scanner;

public class Program05 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = sc.nextInt();

        if(number1 == number2)
        {
            System.out.println("Both numbers are equal.");
        }
        else
        {
            int result = number1 > number2 ? number1 : number2;

            System.out.printf("%d is the greatest number.%n",result);

        }

        sc.close();
    }
    
}

/* Output :
 
case-1 : 
---------
Enter number 1 :
17
Enter number 2 : 
9
17 is greatest number.

case-2 :
---------
Enter number 1 :
-1
Enter number 2 : 
-7
-1 is greatest number.

case-3 :
---------
Enter number 1 :
69
Enter number 2 : 
69
Both numbers are equal.

 */
