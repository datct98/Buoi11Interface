import java.util.ArrayList;
import java.util.List;

public class Bai1431 {
    public static void main(String[] args) {
        kidsWithCandies(new int[]{4,2,1,1,2}, 1);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max= candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(candies[i]> max)
                max=candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>= max)
                list.add(true);
            else list.add(false);
        }
        list.forEach(n-> System.out.println(n));
        return list;
    }
}
