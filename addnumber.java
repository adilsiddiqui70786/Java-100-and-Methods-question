//8TH .. ADD TWO NUMBERS.
import java.util.Scanner;
public class addnumber {
    public static void main(String[] args) {
        int p , m , a;
        System.out.println("enter the two numbers for Adding :");
        Scanner input = new Scanner(System.in);
        p = input.nextInt();
        m = input.nextInt();
        a = p+m;
        System.out.println("TOTAL = " +a);
    }
}
