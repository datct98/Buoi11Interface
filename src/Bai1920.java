public class Bai1920 {
    public static int[] buildArray(int[] nums) {
        int[] ans= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]= nums[nums[i]];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+"\t");
        }
        return ans;
    }

    public static void main(String[] args) {
        buildArray(new int[]{0,2,1,5,3,4});
    }
}
