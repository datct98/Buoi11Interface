public class Bai2114 {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for (int i = 0; i < sentences.length; i++) {
            if(max<sentences[i].split(" ").length)
                max = sentences[i].split(" ").length;
        }
        return max;
    }
}
