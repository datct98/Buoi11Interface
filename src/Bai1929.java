public class Bai1929 {
    public static void main(String[] args) {
        getConcatenation(new int[]{1,2,3,4});
    }

    public static int[] getConcatenation(int[] nums) {
        // 1 2 3 4 1 2 3 4
        int num2[] = new int [nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            num2[i]= nums[i];
            num2[nums.length+i]=nums[i];
        }
        /*for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i]+"\t");
        }*/
        return num2;
    }
}
