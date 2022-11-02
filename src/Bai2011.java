public class Bai2011 {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].contains("+")) sum+=1;
            else sum-=1;
        }
        return sum;
    }
}
