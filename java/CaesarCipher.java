import resources.*;
import java.util.*;

public class CaesarCipher {
    public static String encrypt(String input, int index) {
        String lowerInput = input.toLowerCase();
        StringBuilder encryptedLower = new StringBuilder(lowerInput);
        StringBuilder encrypted = new StringBuilder(input);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(index) + alphabet.substring(0, index);
        for (int i = 0; i < encryptedLower.length(); i++) {
            char currChar = encrypted.charAt(i);
            if (Character.isUpperCase(currChar)) {
                int idx = alphabet.indexOf(currChar);
                if (idx != -1) {
                    char newChar = shiftedAlphabet.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
            } else if (Character.isLowerCase(currChar)) {
                int idxl = (alphabet.toLowerCase()).indexOf(currChar);
                if (idxl != -1) {
                    char newChar = (shiftedAlphabet.toLowerCase()).charAt(idxl);
                    encrypted.setCharAt(i, newChar);
                }
            }
        }
        return encrypted.toString();
    }

    public static String encryptTwoKeys(String input, int key1, int key2) {
        String lowerInput = input.toLowerCase();
        StringBuilder encryptedLower = new StringBuilder(lowerInput);
        StringBuilder encrypted = new StringBuilder(input);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0, key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0, key2);
        for (int i = 0; i < encryptedLower.length(); i++) {
            char currChar = encrypted.charAt(i);
            if (Character.isUpperCase(currChar)) {
                int idx = alphabet.indexOf(currChar);
                if (idx != -1) {
                    char newChar = shiftedAlphabet1.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
            } else if (Character.isLowerCase(currChar)) {
                int idxl = (alphabet.toLowerCase()).indexOf(currChar);
                if (idxl != -1) {
                    char newChar = (shiftedAlphabet2.toLowerCase()).charAt(idxl);
                    encrypted.setCharAt(i, newChar);
                }
            }
        }
        return encrypted.toString();
    }

    public static String decryptTwoKeys(String input, int key1, int key2) {
        String lowerInput = input.toLowerCase();
        StringBuilder encryptedLower = new StringBuilder(lowerInput);
        StringBuilder encrypted = new StringBuilder(input);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0, key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0, key2);
        for (int i = 0; i < encryptedLower.length(); i++) {
            char currChar = encrypted.charAt(i);
            if (Character.isUpperCase(currChar)) {
                int idx = alphabet.indexOf(currChar);
                if (idx != -1) {
                    char newChar = shiftedAlphabet1.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
            } else if (Character.isLowerCase(currChar)) {
                int idxl = (alphabet.toLowerCase()).indexOf(currChar);
                if (idxl != -1) {
                    char newChar = (shiftedAlphabet2.toLowerCase()).charAt(idxl);
                    encrypted.setCharAt(i, newChar);
                }
            }
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        // Get the key from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key: ");
        int key1 = sc.nextInt();
        System.out.println("Enter a second key: ");
        int key2 = sc.nextInt();
        sc.close();

        // Encrypt the message
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key1);
        System.out.println(encrypted);

        // Decrypt the message
        String decrypted = encrypt(encrypted, 26 - key1);
        System.out.println(decrypted);

        // Encrypt the message with two keys
        String encryptedTwoKeys = encryptTwoKeys(message, key1, key2);
        System.out.println(encryptedTwoKeys);

        // Decrypt the message with two keys
        String decryptedTwoKeys = encryptTwoKeys(encryptedTwoKeys, 26 - key1, 26 - key2);
        System.out.println(decryptedTwoKeys);
    }
}
