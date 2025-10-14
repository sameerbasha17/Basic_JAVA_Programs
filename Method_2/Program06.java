/* Given Three integer inputs num1, num2 and num3, the objective is to write a code to "Find the Largest of the Three Numbers" in Java Language. */

// Method-2 : using ternary operator

import java.util.Scanner;

public class Program06 
{
    public static void main(String [] args)
    {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 == number2 && number2 == number3)
        {
            System.out.println("All three numbers are equal. The Greatest number is "+number1);
        }
        else
        {    
            int temp = number1 > number2 ? number1 : number2;
            temp = temp > number3 ? temp : number3;

            System.out.printf("The Greatest is %d%n",temp);
        }

        sc.close();
    }   

    
}

/* Output :
 
case-1 :
--------
Enter three numbers :
99
77
11
The Greatest is 99

case-2 :
--------
Enter three numbers :
-987
-123456
6754
The Greatest is 6754

case-3 :
---------
Enter three numbers :
1709
1709
1709
All three numbers are equal. The Greatest number is 1709

 */
