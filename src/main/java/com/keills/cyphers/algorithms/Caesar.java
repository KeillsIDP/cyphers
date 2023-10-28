package com.keills.cyphers.algorithms;

public class Caesar {
    public static String encode(String input, int key){
        StringBuilder result = new StringBuilder();
        for (Character symb: input.toCharArray()) {
            if(symb.equals(' ')) {
                result.append(" ");
                continue;
            }
            result.append(Character.toChars(symb+key));
        }
        return result.toString();
    }

    public static String decode(String input, int key){
        StringBuilder result = new StringBuilder();
        for (Character symb: input.toCharArray()) {
            if(symb.equals(' ')) {
                result.append(" ");
                continue;
            }
            result.append(Character.toChars(symb-key));
        }
        return result.toString();
    }
}
