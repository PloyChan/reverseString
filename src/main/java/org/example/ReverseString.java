package org.example;

import java.util.Scanner;

public class ReverseString {
    
    public static void reverseString(String str){
        char[] inputStr = str.toCharArray();
        char[] outStr = new char[inputStr.length];

        for(int i = 0; i<inputStr.length; i++){
            outStr[i] = inputStr[inputStr.length-1-i];
        }
        System.out.println(outStr);
    }

    public static void palindrome(){
        Scanner str = new Scanner(System.in);
        System.out.print("Input: ");
        String input = str.nextLine();

        char[] inputStr = input.toCharArray();
        char[] outStr = new char[inputStr.length];

        for(int i = 0; i<inputStr.length; i++){
            outStr[i] = inputStr[inputStr.length-1-i];
        }
        // cannot inputStr + " " because inputStr is char[] , " " is a String
        //sout(inputStr.toString().concat(" "); it convert to String which string of inputStr is a hascode
        System.out.print(inputStr);
        System.out.print(" ");
        System.out.println(outStr);
    }
}
