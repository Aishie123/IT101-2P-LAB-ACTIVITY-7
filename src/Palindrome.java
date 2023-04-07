// Aisha Nicole L. Dones
// Section A122

import java.util.Scanner;

public class Palindrome {

    private static String str;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n-- PALINDROME --\nCreated by: Aisha Nicole L. Dones\n");

        System.out.print("Enter a String: ");
        str = input.nextLine();
        String strReverse = reverse(str);

        if (isPalindrome(strReverse)){
            System.out.println("If the str = \"" + str + "\" is reversed, it is still \"" + strReverse +  "\". It is a palindrome.");
        } else {
            System.out.println("If the str = \"" + str + "\" is reversed, it becomes \"" + strReverse +  "\". It is not a palindrome.");
        }
    } // end of main

    public static String reverse(String str){
        StringBuilder reversedString = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){ reversedString.append(str.charAt(i)); }
        return String.valueOf(reversedString);
    } // end of reverse method

    public static boolean isPalindrome(String strReverse){ return strReverse.equalsIgnoreCase(str); } // end of isPalindrome method
} // end of class
