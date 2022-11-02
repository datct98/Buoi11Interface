import java.util.ArrayList;

public class Bai202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static  boolean isHappy(int n) {
        String s=n+"";

        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            sum+=Math.pow(Integer.parseInt(s.charAt(i)+""), 2);
        }
        System.out.println(sum);
        return Math.ceil(Math.sqrt(sum)) == Math.floor(Math.sqrt(sum));

    }

    public void check(){

    }
}
