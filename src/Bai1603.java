import java.util.ArrayList;
import java.util.List;

public class Bai1603 {
    public static void main(String[] args) {
        String sEmail = "tiendat.chu@n2nconnect.com";
        int index = sEmail.indexOf("@");
        int runIndex = 0;
        while (runIndex < index -1) {
            sEmail = sEmail.replaceFirst(String.valueOf(sEmail.charAt(runIndex)), "x");
            if(String.valueOf(sEmail.charAt(runIndex)).equals(".")){
                System.out.println("......................");
                sEmail = sEmail.replaceFirst(String.valueOf("\\."), "x");

            }
            runIndex++;
        }
        System.out.println(sEmail);

    }

}
