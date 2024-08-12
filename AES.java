import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import javax.crypto.Cipher;
public class AES {
    public static SecretKey getSecretKey()throws Exception {
        KeyGenerator keygen=KeyGenerator.getInstance("AES");
        keygen.init(128);
        SecretKey key=keygen.generateKey();
        return key;
    }  
    public static byte[] encryptedtext(String pt,SecretKey key)throws Exception{
        Cipher aescipher=Cipher.getInstance("AES");
        aescipher.init(Cipher.ENCRYPT_MODE,key);
        byte[] CT1=aescipher.doFinal(pt.getBytes());
        return CT1;
    }
    public static String decryptedtext(byte[] CT1,SecretKey key)throws Exception{
        Cipher aescipher=Cipher.getInstance("AES");
        aescipher.init(Cipher.DECRYPT_MODE,key);
        byte[] bytept=aescipher.doFinal(CT1);
        return new String(bytept);
    }
    public static void main(String[] args)throws Exception {
        try{
        String pt="Hello, world!";
        SecretKey key=getSecretKey();
        byte[]cipher=encryptedtext(pt,key);
        String decrypted=decryptedtext(cipher,key);
        System.out.println("Original text is: "+pt);
        System.out.println("AES key is: "+key.getEncoded());
        System.out.println("Encrypted Text is: "+cipher);
        System.out.println("Decrypted Text is: "+decrypted);
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
