import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // write your code here
        int number = 0 , min = 1, max = 10;
        Scanner keyboard = new Scanner(System.in);
        //boolean error = false;
        boolean isNumberValid = true;

        do
        {
            try
            {
                System.out.print("Please enter a number between " + min + " and " + max +": ");
                number = keyboard.nextInt();
                //error = (number < min || number > max);
                isNumberValid = (number >= min && number <= max);
            }
            catch (InputMismatchException e)
            {
                // clear the keyboard of erroneous input
                keyboard.nextLine();
                //error = true;
                isNumberValid = false;
            }
            if (!isNumberValid)
                System.out.println("\tError! Please enter a number between " + min + " and " + max +": ");

        } while(!isNumberValid);
        //Keep looping as long as this is true

        System.out.println("\nThe number you entered is " + number);
        keyboard.close();

        // Try / Catch Block{}
        // try { // any code that may generate exception and related code
        //     }
        // catch (inputMismatchException) // i = int, e = exception
    }
}
