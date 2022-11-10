import java.util.ArrayList;
import java.util.List;

public class Bai1389 {
    public static void main(String[] args) {
        createTargetArray(new int[] {0,1,2,3,4}, new int [] {0,1,2,2,1});
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int target[] = new int[nums.length];
        for (int i=0; i <nums.length; i++){
            list.add(index[i],nums[i]);
        }
        for (int i=0; i <nums.length; i++){
            target[i]= list.get(i);
        }
        return target;
    }
}
