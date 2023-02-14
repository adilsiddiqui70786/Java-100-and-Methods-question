//15th .... comapre the strings ...

import java.util.Scanner;
public class comparestrings {
    public static void main(String[] args) {
        String s1 , s2;
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the first strings :");
        s1 = pma.next();
        System.out.println("Enter the second strings");
        s2 = pma.next();

        if (s1.compareTo(s2)  > 0)
        System.out.println("First string is greater than second string..");
        else if (s1.compareTo(s2) < 0 )
        System.out.println("fisrt string is smaller than second string..");
        else 
        System.out.println("Both are equals..");
    }
}
