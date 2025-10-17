/* PS :
Find the Reverse of a Number in Java
Given a integer input the objective is to break down the  number into digits and rearrange them in reverse order.
*/

// It's lengthy, but i am learning more deeper with "Strings".

import java.util.Scanner;

public class Program11 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String number = sc.nextLine();

        System.out.println("The reverse of "+ number + " is : "+getReverse(number));

        sc.close();
    }   

    static String getReverse(String number)
    {
        boolean flag = number.startsWith("-");
        if(flag)
        {
            number = number.substring(1);
        }

        String temp = "";
        for(int i = number.length()-1; i >= 0 ; i--)
        {
            temp += number.charAt(i);
        }

        temp = (flag)?("-"+temp): temp;
        return temp;
    }
}

/* Output :
============
Case - 1 :
----------
Enter a number : 
0804
The reverse of 0804 is : 4080

Case - 2 :
----------
Enter a number : 
00001
The reverse of 00001 is : 10000

Case - 3 :
----------
Enter a number : 
-00001
The reverse of -00001 is : -10000

Case - 4 :
----------
Enter a number : 
-0705
The reverse of -0705 is : -5070

 */


 /* Chatgpt's Final verdict of this code :
 =========================================

🏁 Final Verdict

⭐ Score: 100 / 100
⭐ Difficulty Level: Intermediate – Excellent command of strings
⭐ Quality: Clean, readable, and conceptually strong
⭐ Verdict: ✅ Perfectly written with deep understanding.
  
*/

// I am using chatgpt to evaluate my code so that i can improve and cover all the concepts & reduce and optimize the code
