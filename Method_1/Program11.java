/* PS :
Find the Reverse of a Number in Java
Given a integer input the objective is to break down the  number into digits and rearrange them in reverse order.
*/

import java.util.Scanner;

public class Program11
{
    public static void main (String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("The reverse of " + number + " is : "+getReverse(number));

        sc.close();
    }

    static int getReverse(int num)
    {
        int sum = 0, rem =0;

        while(num !=0)
        {
            rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }

        return sum;
    }
}

/* Output :
===========
Case - 1 :
-----------
Enter a number : 
123
The reverse of 123 is : 321

Case - 2 :
-----------
Enter a number : 
-123
The reverse of 123 is : -321

CAse - 3 :
-----------
Enter a number :                // This happens because the int type variable stores as 1 instead of 00001 (it ignores leading 0's).
00001
The reverse of 1 is : 1        // if you want to get 10000 then refer Program 11 in Method 3.

*/

