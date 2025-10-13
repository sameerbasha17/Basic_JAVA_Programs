/* PS : Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd.
To do so the main idea is to divide the number by 2 and check if it’s divisible or not. 
It’s an Even number is it’s perfectly divisible by 2 or an Odd number otherwise. */

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
    }
    
}

/*Output :
 
Enter a number : 
9
Odd

 */
