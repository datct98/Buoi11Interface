public class Bai1108 {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        address = address.replaceAll("\\.","[.]");
        return address;
    }
}
