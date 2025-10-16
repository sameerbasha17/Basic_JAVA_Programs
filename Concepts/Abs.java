/* In this program we study about Math.abs(variable) */


public class Abs
{
    public static void main(String args [])
    {
        byte b1 = 120 , b2 = -120;
        short s1 = 32000, s2 = - 30000;
        int i1 = 878656768, i2 = -2116676459;
        long l1 = 878938347474839l, l2 = -5734587874594589898L;
        float f1 = 348597.57894f, f2 = -0.5874f;
        double d1 =84765849320.758940685, d2 = -753489095.873409548;

        System.out.println("Before Using Math.abs()");
        System.out.printf("b1 = %d , b2 = %d%n",b1,b2);
        System.out.printf("s1 = %d , s2 = %d%n",s1,s2);
        System.out.printf("i1 = %d , i2 = %d%n",i1,i2);
        System.out.printf("l1 = %d , l2 = %d%n",l1,l2);
        System.out.printf("f1 = %f , f2 = %f%n",f1,f2);
        System.out.printf("d1 = %f , d2 = %f%n", d1,d2);
        System.out.println();

        System.out.println("After using the Math.abs() method : ");
        b2 = (byte)Math.abs(b2);      //using this method to get only magnitude of negative numbers
        s2 = (short)Math.abs(s2);
        i2 = Math.abs(i2);
        l2 = Math.abs(l2);
        f2 = Math.abs(f2);
        d2 = Math.abs(d2);
        
        // we can also use this method for positive numbers but it is unnecessary.
        b1 = (byte)Math.abs(b1);   // no need
        f1 = Math.abs(f1);         // no need

        System.out.println("Before Using Math.abs()");
        System.out.printf("b1 = %d , b2 = %d%n",b1,b2);
        System.out.printf("s1 = %d , s2 = %d%n",s1,s2);
        System.out.printf("i1 = %d , i2 = %d%n",i1,i2);
        System.out.printf("l1 = %d , l2 = %d%n",l1,l2);
        System.out.printf("f1 = %f , f2 = %f%n",f1,f2);
        System.out.printf("d1 = %f , d2 = %f%n", d1,d2);
    }  
}
