/* Find the Greatest of the Two Numbers in Java.
Given two integer input Number1 and Number2, the objective is to write a Java code to compare both the Numbers and Find the Greatest of the Two Numbers. 
To do so we’ll use if-else statements and print the output. */

// Method-1: if-else statement

import java.util.Scanner;

public class Program05 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = sc.nextInt();

        if(number1 > number2)
        {
            System.out.printf("%d is the greatest number.%n",number1);
        }
        else if(number1 < number2)
        {
            System.out.printf("%d is the greatest number.%n",number2);
        }
        else{
            System.out.printf("Both numbers are equal.%n");
        }

        sc.close();
    }
    
}

/* Output :
case -1 :
---------
Enter number 1 : 
0
Enter number2 : 
9
9 is the greatest number.

case-2 :
---------
Enter number 1 : 
-98
Enter number2 : 
-9
-9 is the greatest number.

case-3 :
---------
Enter number 1 : 
7
Enter number2 : 
7
Both numbers are equal.

 */
