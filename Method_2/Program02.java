/* PS : Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd.
To do so the main idea is to divide the number by 2 and check if it’s divisible or not. 
It’s an Even number is it’s perfectly divisible by 2 or an Odd number otherwise. */


import java.util.Scanner;

public class Program02 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        String result = number % 2 == 0 ? "even" : "odd";     // Used ternary operator for coincise decision making

        System.out.printf("%d is %s",number,result);

        sc.close();
    }
}

/* Output :
==========================
Case - 1:
---------

Enter a number : 
7
7 is odd


Case - 2 :
-----------

Enter a number : 
0
0 is even


Case - 3 :
-----------

Enter a number : 
-9
-9 is odd


 */

 // This program is executed three times to explore all three cases for sucessful execution.