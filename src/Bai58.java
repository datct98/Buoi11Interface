public class Bai58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
    public static int lengthOfLastWord(String s) {
        String [] s2= s.split(" ");

        return s2[s2.length-1].length();
    }
}
