//17th ... printing the star by adding one one star...
public class printingstar {
    public static void main(String[] args) {
        int row , numofstars;
        for ( row = 1 ; row <= 10; row++)
        {
            for(numofstars = 1; numofstars <= row; numofstars++)
            {
                System.out.println("*");
            }
            System.out.println();   // go to the next line....
        }
    }
}
