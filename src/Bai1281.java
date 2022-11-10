public class Bai1281 {
    public static int subtractProductAndSum(int n) {
        /*String s = String.valueOf(n).replaceAll("","*");
        System.out.println(s);*/
        String s= String.valueOf(n);
        int mul= 1;
        int sum= 0;
        while (n>0){
            mul*= n%10;
            sum+= n%10;
            n/=10;
        }
        System.out.println(mul-sum);
        return mul-sum;
    }

    public static void main(String[] args) {
        subtractProductAndSum(234);
    }
}
