import java.security.*;
public class MD5 {
    public static void main(String[] args) {
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");
            System.out.println("Message digest obj into: ");
            System.out.println("Algorithm= "+md.getAlgorithm());
            System.out.println("Provider= "+md.getProvider());
            System.out.println("toString: "+md.toString());
            String input="";
            md.update(input.getBytes());
            byte[] output=md.digest();
            System.out.println();
            System.out.println(md.getAlgorithm()+"["+input+"]"+"=");
            System.out.println(""+bytesToHex(output));
            input="abcdefghijklmnopqrstuvwxyz";
            md.update(input.getBytes());
            output=md.digest();
            System.out.println();
            System.out.println(md.getAlgorithm()+"["+input+"]"+"=");
            System.out.println(""+bytesToHex(output));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static String bytesToHex(byte[] b){
        char hexdig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuffer buf=new StringBuffer();
        for(int i=0;i<b.length;i++){
            buf.append(hexdig[(b[i]>>4)&0x0f]);
            buf.append(hexdig[b[i]&0x0f]);
        }
        return buf.toString();
    }
}
