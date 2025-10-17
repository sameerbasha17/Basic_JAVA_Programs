/* PS :
Find the Reverse of a Number in Java
Given a integer input the objective is to break down the  number into digits and rearrange them in reverse order.
*/

// This method is not that much efficient one, but i have done this because i felt so enthusastic to work with Strings.

import java.util.Scanner;

public class Program11 
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        boolean flag = (number>0)?false : true;

        number = Math.abs(number);
        String S_number = Integer.toString(number);
    
        getReverse(S_number,flag,number);
        sc.close();
    }   

    static void getReverse(String S_number,boolean flag,int number)
    {
        String rev="" ; int num = 0;

        for(int i = S_number.length() -1  ; i >= 0 ; i--)
        {
            rev = rev + S_number.charAt(i);
        }

        num = Integer.parseInt(rev);

        int result = (flag)?-1*num : num;

        System.out.println("The reverse of "+number+" is : "+result);

    }
}

/* Output : 
============
Case - 1 :
----------
Enter a number : 
220608
The reverse of 220608 is : 806022

Case - 2 :
----------
Enter a number : 
-170601
The reverse of 170601 is : -106071

 */