/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Colin
 */
public class PasswordTester {
    public static void main(String[] args) {
        System.out.println("***** WELCOME TO THE PASSWORD TESTER & GENERATOR *****");
        int i = 0;
        while (i == 0) {
            System.out.println("PLEASE SELECT FROM ONE OF THE MENU OPTIONS BELOW");
            System.out.println("1) Test one of your passwords");
            System.out.println("2) Generate a random password");
            System.out.println("q) Quit");
            Scanner input1 = new Scanner(System.in);
            System.out.print("Selection: ");
            String selection = input1.nextLine();
            if (selection.equalsIgnoreCase("1")) { // good password: atleast 8 characters, contains no space, atleast one UPPERcase, atleast one LOWERcase, atleast one digit, atleast one symbol
               Scanner input2 = new Scanner(System.in);
               System.out.print("Enter a password you would like to test: ");
               String testpassword = input2.nextLine();
               
               if (testpassword.length() < 7) {
                   System.out.println("NOT A GOOD PASSWORD - Must be at least 8 characters long");
               }
               if (!testpassword.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*")) {
                   System.out.println("NOT A GOOD PASSWORD - No Upper-Case Characters");
                   
               }
               if (!testpassword.matches(".*[abcdefghijklmnopqrstuvwxyz].*")) {
                   System.out.println("NOT A GOOD PASSWORD - No Lower-Case Characters");
                   
               }
               if (!testpassword.matches(".*[1234567890].*")) {
                   System.out.println("NOT A GOOD PASSWORD - No Digit Characters");
                   
               }
               if (!testpassword.matches(".*[!\"#$%&'\\[\\]()*+,-./:;<=>?@\\\\^_`{|}~].*")) { 
                   System.out.println("NOT A GOOD PASSWORD - No Symbol Characters");
               }
               if (testpassword.contains(" ")) {
                   System.out.println("NOT A GOOD PASSWORD - No spaces allowed");
               }
               if (testpassword.length() > 7 && testpassword.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*") && testpassword.matches(".*[abcdefghijklmnopqrstuvwxyz].*") && testpassword.matches(".*[1234567890].*") && testpassword.matches(".*[!\"#$%&'\\[\\]()*+,-./:;<=>?@\\\\^_`{|}~].*") && !testpassword.contains(" ")) {
                   System.out.println(testpassword + " is a good password, you should use it!");
               }
               
            } else if (selection.equalsIgnoreCase("2")) {
                System.out.print("Password Generated: ");
                String CAPITAL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
                String DIGITS = "1234567890";
                String SYMBOLS = "!\"#$%&'\\[\\]()*+,-./:;<=>?@\\\\^_`{|}~";
                String generator = CAPITAL + LOWERCASE + DIGITS + SYMBOLS;
                Random randomchar = new Random();
                char[] randompassword = new char[8]; 
                int k = 0;
                while (k == 0) {
                for (int j = 0; j < 8; j++) {
                 randompassword[j] = generator.charAt(randomchar.nextInt(generator.length())); // keep generating passwords until all conditions are met.   
                  }
                String randompass = new String(randompassword);
                if (randompass.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*") && randompass.matches(".*[abcdefghijklmnopqrstuvwxyz].*") && randompass.matches(".*[1234567890].*") && randompass.matches(".*[!\"#$%&'\\[\\]()*+,-./:;<=>?@\\\\^_`{|}~].*")) {
                    k = 1;
                    
                } else {
                     k = 0;
                 }
                }
                 System.out.println(randompassword);
                
                
            } else if (selection.equalsIgnoreCase("q")) {
              i = 1;
              System.out.println("QUITTING. GOOD-BYE.");
            } else {
                System.out.println("ERROR: INVALID SELECTION");
            }
            
            
        }
    }
    
}
