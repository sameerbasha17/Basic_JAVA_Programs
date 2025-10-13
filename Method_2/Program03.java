/* PS : Find the Sum of First N Natural Numbers in Java.
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. */

// Method 01 : Using the formula "sum of Nth term"

import java.util.Scanner;

public class Program03 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();           

        int result = n*(n+1)/2;             // runs in O(1) time complexity.
        System.out.printf("The sum of first %d natural numbers is : %d",n,result);
        
        sc.close();
    }

}
    
/* Output :
 
Enter n : 
9
The sum of first 9 natural numbers is : 45

 */

