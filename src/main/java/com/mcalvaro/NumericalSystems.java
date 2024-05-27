package com.mcalvaro;
 
public class NumericalSystems {
 
    public static void main(String[] args) {
        
        // Decimal
        int decimalNumber = 500;
        System.out.println("Decimal Number: " + decimalNumber);

        // Binary
        System.out.println("Binary Number: " + Integer.toBinaryString(decimalNumber));
        // Define Binary with 0b
        int binaryNumber = 0b111110100;
        System.out.println("Binary Number: " + binaryNumber);

        // Octal
        System.out.println("Octal Number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber));
        // Define Octal with 0
        int octalNumber = 0764;
        System.out.println("Octal Number: " + octalNumber);

        // Hexadecimal
        System.out.println("Hexadecimal of " + decimalNumber + " = " + Integer.toHexString(decimalNumber));
        // Define Hex with 0x
        int hexNumber = 0x1f4;
        System.out.println("Hex Number: " + hexNumber);
    }
}
