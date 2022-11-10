public class Bai1342 {
    public static void main(String[] args) {

    }
    public static int numberOfSteps(int num) {
        int step =0;
        while (num>0){
            if(checkEven(num)) num=num/2;
            else num=num-1;
            step++;
        }
        return step;
    }
    public static boolean checkEven(int n){
        return n%2==0;
    }
}
