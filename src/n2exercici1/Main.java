package n2exercici1;

public class Main {
    public static void main(String[] args) {

        byte b = Input.readByte("Enter a number between -128 and 127:");
        System.out.println(b);

        int i = Input.readInt("Enter a' whole number:");
        System.out.println(i);

        float f = Input.readFloat("Enter a decimal number:");
        System.out.println(f);

        double d = Input.readDouble("Enter another decimal number:");
        System.out.println(d);

        char c = Input.readChar("Enter a single character:");
        System.out.println(c);

        String s = Input.readString("Enter a word:");
        System.out.println(s);

        boolean bool = Input.readYesNo("Enter yes (y) or no (n):");
        System.out.println(bool);

    }
}