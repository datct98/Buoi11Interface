import java.util.Arrays;

public class Bai14 {
    public String longestCommonPrefix(String[] strs) {
        // strs = ["flower","flower","flower","flower"]
        String r="";
        int n=strs.length;
        Arrays.sort(strs);//Sorted first
        String s=strs[0];//smallest no of char
        String h=strs[n-1];//highest no of char
        for(int i =0;i<s.length();i++)//taken smallest length so that run time will be less
        {
            if(s.charAt(i)!=h.charAt(i)) break;
            r=r+s.charAt(i);
        }
        return r;
    }
}
