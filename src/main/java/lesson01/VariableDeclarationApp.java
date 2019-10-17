package lesson01;

public class VariableDeclarationApp {
    public static void main(String[] args) {
        int x = 0x41; // 4*16^1+1*16^0
        int age = 30;
        // way 1
        long zz = 67576576;
        long card_number1 = 1234567810111213L;
        // way 2
        long card_number2 = 1234_5678_1011_1213L;
        int money = 50_000;
        String name = "Alex";
        char letterA = 'A';
        char letterB = 66;
        char letterC = 'B' + 1;
        int distance = 'Z' - 'A';
        boolean valid = true;
        float k = 1.5F;
        double tan = 0.367;

        // char actually is a short (2 byte)
        System.out.println(letterA);
        System.out.println(letterB);
        System.out.println(letterC);
        System.out.println(distance);
        adds((byte) 100, (byte)100);
    }

    public static int adds(byte a, byte b) {
        return a + b;
    }
}
