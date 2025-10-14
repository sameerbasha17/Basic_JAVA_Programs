/* Let's understand how Format Specifiers work */


public class FormatSpecifier 
{
    public static void main(String [] args)
    {
        double number1 = 123456.123456;
        double number2 = 1234.123;
        float number3 = 9;
        float number4 = 1234;
        
        System.out.printf("Number 1 : %.2f%n",number1);
        System.out.printf("Number 1 : %5.2f%n",number1);
        System.out.printf("Number 1 : %10.2f%n",number1);
        System.out.printf("Number 2 : %8.2f%n",number2);
        System.out.printf("Number 3 : %11.2f%n",number3);
        System.out.printf("Number 2 : %08.2f%n",number2);
        System.out.printf("Number 4 : %05f%n",number4);
        System.out.printf("Number 4 : %02f%n",number4);
        System.out.printf("Number 4 : %f%n",number4);
        System.out.printf("Number 4 : %6f%n",number4);
        System.out.printf("Number 4 : %08f%n",number4);
        System.out.printf("Number 4 : %08.02f%n",number4);
    }
}
