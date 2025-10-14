/* PS : Check given number is positive or negative.
 * Input : a integer.
 * Output : A message that prints the nubmer is "positive" or "negative" or "zero".
*/

import java.util.Scanner;

public class Program01 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if(number ==0)
        {
            System.out.println("The number is zero.");
        }
        else
        {
            String result = number>0?"positive" : "negative";
            System.out.println("The number is "+result+".");
        }

        sc.close();
    }
    
}

/* Output : 
 
Enter a number : 
9
The number is positive.

 */
