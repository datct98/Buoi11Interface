import java.util.Arrays;

public class Bai2160 {
    public static void main(String[] args) {

    }
    public static int minimumSum(int num) {
        // 4922 2249
        // 1234
        String s[] = String.valueOf(num).split("");
        Arrays.sort(s);
        int x = Integer.parseInt(s[0]+s[2]);
        int y = Integer.parseInt(s[1]+s[3]);
        return x+y;
    }
}
