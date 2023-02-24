package org.example;

public class ReverseString {
    
    public static void reverseString(String str){
        char[] inputStr = str.toCharArray();
        char[] outStr = new char[inputStr.length];

        for(int i = 0; i<inputStr.length; i++){
            outStr[i] = inputStr[inputStr.length-1-i];
        }
        System.out.println(outStr);
    }

}
