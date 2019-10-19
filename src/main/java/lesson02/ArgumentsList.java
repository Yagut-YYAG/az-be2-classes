package lesson02;

public class ArgumentsList {
    public static void main(String[] arguments) {
        String file;
        if (arguments.length > 0) {
            file = arguments[0];
        } else {
            file = "file.txt";
        }
        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("param %d: %s\n", i, arguments[i]);
        }
    }
}
