/* PS : Find the Sum of First N Natural Numbers in Java.
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. */

// Method 01 : for - loop method 

import java.util.Scanner;

public class Program03 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int result = 0;
        for(int i = 1; i <= n; i++)                // Makes the time complexity O(n).
        {
            result += i;
        }
         
        System.out.printf("The sum of first %d natural numbers is %d",n,result);
    }
}

/* Output :  
 
Enter n : 
9
The sum of first 9 natural numbers is 45

*/
