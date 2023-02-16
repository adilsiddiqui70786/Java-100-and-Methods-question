// 19th while loop in java..
import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
    int n;
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer..");
        

        while(( n = in.nextInt() ) != 0)
        {
            System.out.println("you enetered number =" +n);
            System.out.println("input an integer");
        } 
        System.out.println("Out of loop");

    }
}
}