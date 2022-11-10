public class Bai1678 {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)()"));
    }
    public static String interpret(String command) {
        command = command.replace("()","o").replace("(al)","al");
        return command;
    }

}
