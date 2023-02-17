//21 ..  Using break with while loop..
import java.util.Scanner;
public class whileloop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("input an integer");
            int n = input.nextInt();
            if(n==0 || n ==10) //if we enter 0 and 10 the program came out from loop..
            {
                break;
            }
            System.out.println("You enetered " +n);
        }


    }
}
