// 13th ... TO CHECK THE INTEGER IS ODD OR EVEN
import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args) 
    {
        System.out.println("Enter the integer to check odd & even..");
        Scanner pma = new Scanner(System.in);
        int  integer = pma.nextInt();
        if(integer%2==0)
        System.out.println("the given integer is even");
        else
        System.out.println("the given integer is odd");
        
    }
}
