/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love.phoney.pigs;

import java.util.Scanner;

public class LovePhoneyPigs {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Today we are going to find if you and"
                + "your special someone are meant to be!");
        System.out.println("What is your name? ");
        String yName = in.nextLine().toLowerCase();
        System.out.println("What is your special someones name?");
        String tName = in.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i <= yName.length(); i++) {
            if (yName.charAt(i) == 'l'
                    || yName.charAt(i) == 'o'
                    || yName.charAt(i) == 'v'
                    || yName.charAt(i) == 'e') {
                count++;
                
            }
        }
        
        for (int i = 0; i <= tName.length(); i++) {
            if (tName.charAt(i) == 'l' || tName.charAt(i) == 'L') {
                count++;
            } else if (tName.charAt(i) == 'o' || tName.charAt(i) == 'O') {
                count++;
            } else if (tName.charAt(i) == 'v' || tName.charAt(i) == 'V') {
                count++;
            } else if (tName.charAt(i) == 'e' || tName.charAt(i) == 'E') {
                count++;
            }

        }
        if (count % 2 == 0) 
            System.out.println("NO LOVE");
         else 
            System.out.println("LOVE");
        

    }

    /**
     *
     * @return
     */
    public static String number () {
        System.out.println("Hello, today we are going to create a phone"
                + "number for your company");
        System.out.println("Enter in a 7 letter word or prhase");
        System.out.println("1-800-" );
        String number = in.nextLine().toLowerCase();
        
        String
        replaceString;
        replaceString = number.replaceAll("a", "2");
        replaceString = number.replaceAll("b", "2");
        replaceString = number.replaceAll("c", "2");  
        replaceString = number.replaceAll("d", "3");
        replaceString = number.replaceAll("e", "3");
        replaceString = number.replaceAll("f", "3");
        replaceString = number.replaceAll("g", "4");
        replaceString = number.replaceAll("h", "4");
        replaceString = number.replaceAll("i", "4");
        replaceString = number.replaceAll("j", "5");
        replaceString = number.replaceAll("k", "5");
        replaceString = number.replaceAll("l", "5");
        replaceString = number.replaceAll("m", "6");
        replaceString = number.replaceAll("n", "6");
        replaceString = number.replaceAll("o", "6");
        replaceString = number.replaceAll("p", "7");
        replaceString = number.replaceAll("q", "7");
        replaceString = number.replaceAll("r", "7");
        replaceString = number.replaceAll("s", "7");
        replaceString = number.replaceAll("t", "8");
        replaceString = number.replaceAll("u", "8");
        replaceString = number.replaceAll("v", "8");
        replaceString = number.replaceAll("w", "9");
        replaceString = number.replaceAll("x", "9");
        replaceString = number.replaceAll("y", "9");
        replaceString = number.replaceAll("z", "9");
        
        System.out.println(replaceString);
        return null;
    
    }
}

