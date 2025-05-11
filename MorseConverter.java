import java.util.Scanner;
/**
*Description: This program asks the user to enter a string,
*then converts that string to Morse code.
*Class: Fall - COSC 1437.82013
*Assignment8:Morse Code Converter
*Date: 04/15/2024
*@author Sudip Paudel
*@version 0.0.0
*/ 

/**
 * The MorseConverter class converts a user-provided string into its Morse code equivalent.
 */
public class MorseConverter {
    /**
     * The main method of the MorseConverter class, responsible for taking user input
     * and displaying the Morse code equivalent.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string (up to a maximum of 40 characters)
        System.out.print("Enter the string (Up to a maximum of 40 characters): ");
        String original = scanner.nextLine();

        // Create a Morse object with the user-provided string
        Morse message = new Morse(original);

        // Display the original string and its Morse code equivalent
        System.out.println("The Morse code equivalent of \"" + message.getOriginal() + "\" is: " + message.getMorseCode());
    }
}
