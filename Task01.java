/**

 * File: Task02.java

 * Authors: Claire Apovo and Rumen Balashov

 * Date: 10/27/2022

 * Last modified on: 10/30/2022

 */
import java.util.Scanner;
import java.lang.*;

public class Task01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the phone number: ");
        String number = keyboard.nextLine();

        // prints "Invalid number" if the input has characters in it or has an inappropriate length
        if(hasCharacters(number) || invalidLength(number)){
            System.out.println("Invalid Number");
        }
        //prints "ignore the call" if all conditions for a telemarketer number are met
        else if(validBeginning(number) && validEnding(number) && validBetween(number)){
            System.out.println("Ignore the call !");
        }
        else{
            System.out.println("Answer the phone");
        }
    }

    //returns true when the input cannot be parsed to int, thus it has characters in it
    public static boolean hasCharacters(String input) {
        try {
            Integer.parseInt(input);
            return false;
        } catch (NumberFormatException exc) {
            return true;
        }
    }

    // returns true if the number has more or less than 4 digits
    public static boolean invalidLength(String input) {
        return input.length() != 4;
    }

    // returns true if the first digit is 8 or 9
    public static boolean validBeginning(String input){
        return input.charAt(0) == '8' || input.charAt(0) == '9';
    }

    // returns true if the last digit is 8 or 9
    public static boolean validEnding(String input){
        return input.charAt(3) == '8' || input.charAt(3) == '9';
    }

    // returns true if the second and third digit are the same
    public static boolean validBetween(String input){
        return input.charAt(1) == input.charAt(2);
    }
}
