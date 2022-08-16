import resources.*;
import java.util.*;

public class CaesarCipher {
    public static String encrypt(String input, int index) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(index) + alphabet.substring(0, index);
        for (int i = 0; i < encrypted.length(); i++) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key: ");
        int key = sc.nextInt();
        sc.close();
        
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26 - key);
        System.out.println(decrypted);
    }
}
