/* Given Three integer inputs num1, num2 and num3, the objective is to write a code to "Find the Largest of the Three Numbers" in Java Language. */

// Method-3 : using ternary operator

import java.util.Scanner;

public class Program06 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        if ( number1 == number2 && number2 == number3)
        {
            System.out.println("All numbers are equal. The greatest number is "+number1);
        }
        else
        {
            double result = (number1 > number2) ? (number1 > number3 ? number1 : number3) :(number2 > number3 ? number2 : number3);

            System.out.printf("The Greatest number is %.2f%n",result);

        }

        sc.close();
    }

}

/* Output :
 
case-1 :
---------
Enter three numbers : 
22
-71
1.097
The Greatest number is 22.00

case-2 :
---------
Enter three numbers : 
0917 0917 0917
All numbers are equal. The greatest number is 917.0

 */