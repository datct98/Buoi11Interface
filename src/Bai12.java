import java.util.HashMap;
import java.util.Map;

public class Bai12 {
    public static void main(String[] args) {

    }
    public String convertIntToString(int num){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(5, "V");
        map.put(10,"X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        String[] x = String.valueOf(num).split("");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        for (int i = x.length-1; i >=0 ; i--) {

        }
        return map.get(num);
    }
}
