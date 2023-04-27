package nine.group;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256HashFunction {

    public static String hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 algorithm not found");
            return null;
        }
    }

    public static void main(String[] args) {
        String input = "hello";
        String hashedValue = hash(input);
        System.out.println("Hash value of " + input + " is " + hashedValue);
    }
}

