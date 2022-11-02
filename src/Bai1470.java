public class Bai1470 {
    public static void main(String[] args) {
        System.out.println(shuffle(new int[]{2,5,1,3,4,7}, 3));
    }

    // 2,5,1,3,4,7
    public static int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k]=nums[i];
            k++;
            ans[k]=nums[n+i];
            k++;
        }
        return  nums;
    }
}
