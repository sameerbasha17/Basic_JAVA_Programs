/* In java,
            The "continue" keyword is used to skip a iteration when it called.
            The "break" keyword is used to terminate/stop the nearest loop statement or switch statement.
            But, the "System.exit(0) is used to terminate the entire program no matter how and where it called, the remaining code never execute after this statement.
            This program is going to be a good demonstration of control flow statements "
 */

public class ExitAndBreakAndContinue
{
    public static void main(String [] agrs)
    {
        continueMethod();

        System.out.println();
        breakMethod();

        System.out.println();
        ExitAndBreakAndContinue obj = new ExitAndBreakAndContinue();
        obj.exitMethod();

        System.out.println("This code never execute.");
    }   

    private static void continueMethod()
    {
        System.out.println("Using 'continue' keyword to skip a iteration when ' i = 3'.");
        for(int i = 0; i <=5 ; i++)
        {
            if(i == 3)
            {
                continue;
            }
            System.out.printf("i = %d%n",i);
        }

    }

    public static void breakMethod()
    {
        System.out.println("Using a break statement to stop a loop(for) when i = 3. The remaining code will be executed excluding this loop.");
        for(int i = 0; i<=5; i++)
        {
            if(i == 3)
                break;
            System.out.println("i = "+i);
        }
        System.out.println("Remaining code after for-loop.");
    }

    void exitMethod()
    {
        System.out.println("Using a 'System.exit(0) statement when i = 3' . You never execute the rest of the remaining code after it called. ");

        for(int i = 0; i <= 5; i++)
        {
            if(i == 3)
                System.exit(0);
            System.out.println("i = "+i);
        }
        System.out.println("Remaining code after for-loop.");
    }
}

/* Output :
================

Using 'continue' keyword to skip a iteration when ' i = 3'.
i = 0
i = 1
i = 2
i = 4
i = 5

Using a break statement to stop a loop(for) when i = 3. The remaining code will be executed excluding this loop.
i = 0
i = 1
i = 2
Remaining code after for-loop.

Using a 'System.exit(0) statement when i = 3' . You never execute the rest of the remaining code after it called.
i = 0
i = 1
i = 2


 */
