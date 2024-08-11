import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Main {
    public static void main(String[] args) throws Exception {
        KeyGenerator keygen = KeyGenerator.getInstance("Blowfish");
        SecretKey seckey = keygen.generateKey();
        Cipher cipher = Cipher.getInstance("Blowfish");
        
        String inputtext = "Hello Babu";
        
        cipher.init(Cipher.ENCRYPT_MODE, seckey);
        byte[] encrypted = cipher.doFinal(inputtext.getBytes());
        
        cipher.init(Cipher.DECRYPT_MODE, seckey);
        byte[] decrypted = cipher.doFinal(encrypted);
        
        System.out.println("Original String: " + inputtext);
        System.out.println("Encrypted String: " + new String(encrypted));
        System.out.println("Decrypted String: " + new String(decrypted));
    }
}
