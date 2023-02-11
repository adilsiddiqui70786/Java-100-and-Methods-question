//11...  paas n fail using if and else condition
import java.util.Scanner;
public class ifelse2 {
    
    public static void main(String[] args) {
        int marksobtained , passingmarks;
        passingmarks = 40;

        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the marks obtained by you");
        marksobtained = pma.nextInt();
        

        if (marksobtained >= passingmarks)
        {
            System.out.println("Congrats you passed..🫴");

        }
        else
        {
           System.out.println("oops, You failed");
        }
    }
}
