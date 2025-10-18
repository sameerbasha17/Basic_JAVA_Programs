/* 
------------------------------------------------------------
Program No.   : 01
Topic         : Conditional Statements
Program Title : Check if a number is positive, negative, or zero
Author        : Shaik Sameer Basha
Date Created  : 13-Oct-2025
Last Modified : 18-Oct-2025
Language Used : Java
IDE Used      : VS Code
------------------------------------------------------------

 ★ PS     : Check given number is positive or negative.
 ✩ Input  : a integer.
 ✩ Output : A message that prints the number is "positive" or "negative" or "zero".
-------------------------------------------------------------
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

/* 


------------------------------------------------------------
ChatGPT’s Final Verdict :
=========================
Difficulty Level : Easy
Code Quality     : Excellent — clean structure and clear logic.
Verdict          : ✅ Beginner-friendly program with solid input handling.

Challenges Faced :
------------------
Initially i didn’t handle invalid input. Fixed it using hasNextInt().

Learning Outcome :
------------------
I Learnt about input validation and ternary operator.

------------------------------------------------------------
*/
