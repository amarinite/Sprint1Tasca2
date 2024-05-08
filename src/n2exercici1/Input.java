package n2exercici1;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public Input() {}

    public static byte readByte(String missatge) {
        return scanner.nextByte();
    };

    public static int readInt(String missatge) {
        return scanner.nextInt();
    };

    public static float readFloat(String missatge) {
        return scanner.nextFloat();
    };

    public static double readDouble(String missatge) {
        return scanner.nextDouble();
    };

}
