// package Method_1;
/* problem : Check given number is positive or negative.
 * Input   : a integer.
 * Output  : A message that prints the nubmer is "positive" or "negative" or "zero".
*/

import java.util.Scanner;
class Program01
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        // Brute force method through if-else

        if(number > 0)
        {
            System.out.printf("%d is a positive number.",number);
        }
        else if(number<0)
        {
            System.out.printf("%d is a negative number.",number);
        }
        else{
            System.out.println("The number is zero");
        }
        sc.close();
    }
}

/* Output:
===========
Case - 1 :
---------
Enter the number : 
09 
9 is a positive number.

Case - 2 :
---------
Enter the number : 
-7
-7 is a negative number.

Case - 3 :
----------
Enter the number : 
0
The number is zero

*/


/* 
Chatgpt's Final Verdict :
=========================
Score           : 95 / 100
Difficulty Level: Easy
Code Quality    : Excellent — clean structure, clear logic, proper use of Scanner, and well-formatted output.
Verdict         : ✅ Perfect for beginners! Shows strong understanding of conditional statements and input handling.
Improvement Suggestion : You could simplify output by using ternary operator or add input validation for non-numeric values.  

My ACTION towards Improvement : 
-------------------------------
I have used ternary operator and also added input validation for non-numberic values in Program01 in method_2. (Refer there).

Challenges faced :
------------------
Minimal, I felt encouraging because i completed this program within 2 minutes.

*/
