import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bai1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        // 8 1 2 2 3
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsValue(nums[i])) map.put(i,0);
            else map.put(i, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {

        }
        /*for (int i = 0; i < nums.length; i++) {
            int count =0;
            for (int j = 0; j < nums.length; j++) {
                if(i==j) continue;
                if(nums[i]>nums[j]) count++;
            }
            ans[i]=count;
        }*/
        return ans;
    }

    public static void main(String[] args) {
        smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }
}
