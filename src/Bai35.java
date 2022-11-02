public class Bai35 {
    public int searchInsert(int[] nums, int target) {
        //1 3 5 6 7 8
        if(target<nums[0]) return 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]== target || (i> 0 && nums[i-1]<= target && nums[i]>target))
                return i;
            //else if( )
            //else if(target<nums[i]) return i-1;
        }
        return nums.length;
    }
}
