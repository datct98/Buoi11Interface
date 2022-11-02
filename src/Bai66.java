import java.math.BigInteger;

public class Bai66 {
    public static void main(String[] args) {

        plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }
    public static int[] plusOne(int[] digits) {
        int []afterPlus;
        String x="";
        for (int i = 0; i < digits.length; i++) {
            x+=digits[i];
        }
        BigInteger bigInteger = new BigInteger(x);

        bigInteger = bigInteger.add(BigInteger.valueOf(1));
        String y[] = bigInteger.toString().split("");
        afterPlus = new int[bigInteger.toString().length()];

        for (int i = 0; i < bigInteger.toString().length(); i++) {
            System.out.println(y[i]);
        }

        return afterPlus;
    }
}
