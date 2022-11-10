import java.util.*;

public class Bai1528 {
    public static String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }
        String s1 = "";
        for (int i = 0; i < map.size(); i++) {
            s1= s1+ map.get(i);
        }
        return s1;


    }

    public static void main(String[] args) {
        restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
    }
}
