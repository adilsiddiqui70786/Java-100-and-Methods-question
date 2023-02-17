// Using break and continue in while loop...
import java.util.Scanner;
public class whileloop3 {
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        while (true) {
            System.out.println("Input an integer");
            int n = pma.nextInt();
            
            if (n==0) {
                System.out.println("You enetered "+n);
                continue;
            }
            else{
            break;
            }    
        }
    }
}
