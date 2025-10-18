/* 
------------------------------------------------------------
Program No.   : 02
Program Title : Check if a number is even or odd.
Author        : Shaik Sameer Basha
Date Created  : 13-Oct-2025
Last Modified : 18-Oct-2025
IDE Used      : VS Code
------------------------------------------------------------

 ★ PS     : Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd.
 ✩ Input  : a integer.
 ✩ Output : A message that prints the number is "Even" or "Odd".
-------------------------------------------------------------
*/


import java.util.Scanner;
public class Program02 
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if (number % 2 ==0)                  // if the remainder gets 0, then the number is definitely divisible by 2 (which makes number even). 
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

        sc.close();
    }
    
}

/*Output :
=============
Case - 1 :
----------
Enter a number : 
9
Odd

Case - 2 :
----------
Enter a number : 
-7
Odd

Case - 3 :
----------
Enter a number : 
0
Even

*/


/* 
Chatgpt's Final Verdict :
=========================
Code Quality : Very Good — concise and clear logic, proper structure.
Verdict : ✅ Accurate and beginner-friendly implementation.
Improvement : Add input validation using hasNextInt() for better robustness.
================================================================================

My ACTION towards Improvement : 
-------------------------------
I added input validation and also used ternary operator in Program02 in method_2.

Challenges faced :
------------------
Minimal, I came with this logic when i see that PS. It's only getting started...



*/
