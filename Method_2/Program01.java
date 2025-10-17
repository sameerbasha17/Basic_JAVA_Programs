/*
 ★ PS     : Check given number is positive or negative.
 ✩ Input  : a integer.
 ✩ Output : A message that prints the number is "positive" or "negative" or "zero".
*/

import java.util.Scanner;

public class Program01 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input ! please enter a valid input.");
            sc.close();
            return;
        }

        int number = sc.nextInt();

        if(number ==0)
        {
            System.out.println("The number is zero.");
        }
        else
        {
            String result = (number > 0) ? "positive" : "negative";
            System.out.println("The number is "+result+".");
        }

        sc.close();
    }
    
}

/* Output : 
============
Case - 1 :
----------
Enter a number : 
9
The number is positive.

Case - 2 :
----------
Enter a number : 
-7
The number is negative.

Case - 3 :
----------
Enter a number : 
0
The number is zero.

Case - 4 :
----------
Enter a number : 
sameer
Invalid input ! please enter a valid input.

 */

 /* Chatgpt's Final Verdict :
=============================
Difficulty Level: Easy
Code Quality: Excellent — clean structure, readable logic, proper use of ternary operator, and input validation included. Well-formatted output and clear comments.

Challenges faced :
-----------------
Minimal, i have learnt the Scanner class methods like hasInt(),hasFloat(),etc... */
