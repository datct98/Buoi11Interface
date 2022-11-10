import java.util.List;

public class Bai1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(getValue(ruleKey)).equals(ruleValue)) count++;
        }
        return count;
    }

    public static int getValue(String s){
        if (s.equals("color")) return 1;
        else if(s.equals("type")) return 0;
        return 2;
    }

    public static void main(String[] args) {
        //System.out.println(countMatches());
    }
}
