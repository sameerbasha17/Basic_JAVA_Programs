// package Method_1;
/* problem : Check given number is positive or negative.
 * Input : an integer.
 * Output : A message that prints the nubmer is "positive" or "negative" or "zero".
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

Enter the number : 
09 
9 is a positive number.

*/