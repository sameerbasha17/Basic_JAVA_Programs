/* Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods.
To do so we basically iterate from the base interval to the final interval and keep adding the number.  */

// Method-1 : Brute force 

import java.util.Scanner;

public class Program04 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial number : ");
        int start_number = sc.nextInt();
        System.out.println("Enter the final number : ");
        int end_number = sc.nextInt();

        if(start_number > end_number)
        {
            System.out.println("The initial number should be less then final number. Please enter a valid input !!");
        }
        else
        {   
            int result = 0;
            for(int i = start_number; i<=end_number; i++)
            {
                result +=i;
            }

            System.out.printf("The sum of all numbers between %d and %d is %d",start_number,end_number,result);

        }
        sc.close();
    }
    
}

/* Output :
 
Enter initial number : 
7
Enter the last number : 
9
The sum of all numbers between 7 and 9 is 24

 */
