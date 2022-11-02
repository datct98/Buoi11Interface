public class Bai1480 {
    public static void main(String[] args) {
        runningSum(new int[]{1,2,3,4});
    }

    public static int[] runningSum(int[] nums) {

        int ans[] = new int[nums.length];
        ans[0]= nums[0];
        int sum =ans[0];
        for (int i = 1; i < nums.length; i++) {
            sum+=nums[i];
            ans[i] = sum;
        }

        return ans;
    }
}
