package ocp.classe.cap7.exceptions.assertions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanException {
    public static void main(String [] args) {
        String integerStr = "100";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(integerStr);
        try {
            System.out.println("The integer value scanned from string is: " +
                    consoleScanner.nextInt());
        } catch(InputMismatchException ime) {
// nextInt() throws InputMismatchException in case
// anything other than an integeris provided in the string
            System.out.println("Error: Cannot scan an integer from the given string");
        }
    }
}
