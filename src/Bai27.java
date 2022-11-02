public class Bai27 {
    public int removeElement(int[] nums, int val){
        //[3,2,2,3]
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
