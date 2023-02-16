//20th..... reverse the number..
import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        int n , reverse = 0;
        System.out.println("enter an integer to reverse it..");
        Scanner pma = new Scanner(System.in);
        n = pma.nextInt();
         
        while( n != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        System.out.println("the reverse number is = " +reverse);
    }
}
