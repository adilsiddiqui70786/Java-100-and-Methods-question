//14th... Find the factorial for the given number...
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the integer to calculate its factorial");
        int c , factorial = 1;
        Scanner pma = new Scanner(System.in);
        int num = pma.nextInt();
        if(num<0)
        System.out.println("Number should be non-negative.");
        else
        {
            for( c = 1 ; c <= num ; c++)
            factorial = factorial*c;

            System.out.println("Factorial of "+num+" is = " +factorial);

        }
    }
}


/*CALCULATE FACTORIAL FOR LARGE NO..
import java.util.Scanner;
import java.math.BigInteger;
class BigFactorial
{
    public static void main(String args[])
 {
    int n, c;
    BigInteger inc = new BigInteger("1");
    BigInteger fact = new BigInteger("1");
    Scanner input = new Scanner(System.in);
    System.out.println("Input an integer");
    n = input.nextInt();
    for (c = 1; c <= n; c++) 
   {
     fact = fact.multiply(inc);
     inc = inc.add(BigInteger.ONE);
   }
    
   System.out.println(n + "! = " + fact);
 }
}


   
   

 */