import java.util.Scanner;
public class nestedifelse
 {
    public static void main(String[] args)
     {
        char grade;
        int marksobtained , passingmarks;
        passingmarks = 40;
        Scanner pma = new Scanner(System.in);
        System.out.println("Type the marks scored by you..");
        marksobtained = pma.nextInt();

        if (marksobtained >= passingmarks)
        {
         
        if(marksobtained > 90)
         grade = 'A';
         else if (marksobtained > 75)
         grade = 'B';
         else if (marksobtained > 60)
         grade = 'C';
         else
         grade = 'D';
         System.out.println("you passed yor exam and your grade is : " + grade);
       }
         else 
         {
           grade = 'F';
            System.out.println("you failed yor exam and your grade is .. " + grade);

         }
    }
 }

