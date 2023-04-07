// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;
import java.util.Scanner;

public class DecimalToBinary {

    private static int val;

    public static void main(String[] args){
        System.out.println("\n-- DECIMAL TO BINARY --\nCreated by: Aisha Nicole L. Dones");
        enterInteger();
        System.out.println(binary(val));
    } // end of main

    public static String binary (int val){
        StringBuilder strBinary = new StringBuilder();
        int[] binaryArr = new int[100];
        binaryArr[0] =  0;
        int i = 0;
        while (val > 0){ binaryArr[i++] = val % 2; val/=2; }
        for (int j = i-1; j >= 0; j--){ strBinary.append(binaryArr[j]); }
        return String.valueOf(strBinary);
    } // end of binary method

    private static void enterInteger(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter an integer: ");
            val = input.nextInt();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    "INVALID INPUT! Please enter an integer.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterInteger();
        }
    } // end of enterInteger method

} // end of class
