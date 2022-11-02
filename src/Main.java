public class Main {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
        Bai14 bai14 = new Bai14();
        String [] strs = new String[]{"flower","flower","flower","flower"};
        System.out.println(bai14.longestCommonPrefix(strs));

        System.out.println(new Bai20().isValid("[{({(){}})}]"));
        /*System.out.println(isPalindrome(1000001));
        int[] nums = new int[]{2,4,1,3};
        int[] result = twoSum(nums, 5);
        for (Integer i: result)
            System.out.println(i);*/
    }

    public static int convertToInt(String s){
        int i=0;
        switch(s){
            case "I":
                i=1;
                break;
            case "V":
                i=5;
                break;
            case "X":
                i=10;
                break;
            case "L":
                i=50;
                break;
            case "C":
                i=100;
                break;
            case "D":
                i=500;
                break;
            case "M":
                i=1000;
                break;
        }
        return i;
    }

    public static int romanToInt(String s) {
        int sum=0;
        for (int i=0; i<s.length()-1; i++){
            if(convertToInt(s.charAt(i)+"")< convertToInt(s.charAt(i+1)+"")){
                sum+=(convertToInt(s.charAt(i+1)+"") - convertToInt(s.charAt(i)+""));
                i++;
                if(i==s.length()-1) return sum;
            } else sum+=convertToInt(s.charAt(i)+"");
        }
        sum+= convertToInt(s.charAt(s.length()-1)+"");
        return sum;
    }

    public static boolean isPalindrome(int x) {
        String s = x+"";
        String s2="";
        for(int i=s.length()-1; i>=0 ; i--){
            s2+=(s.charAt(i));
        }
        if (s.equals(s2)) return true;
        return false;
    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i< nums.length -1; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
