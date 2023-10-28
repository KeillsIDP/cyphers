package com.keills.cyphers.algorithms;

public class Gamma {
    public static String execute(String message, String key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char messageChar = message.charAt(i);
            char keyChar = key.charAt(i % key.length());
            char encryptedChar = (char) (messageChar ^ keyChar);
            result.append(encryptedChar);
        }

        return result.toString();
    }
}
