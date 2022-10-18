import java.util.Scanner;
public class F4D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        toBinary(a);
        toOctal(a);
        toHex(a);
        toH(a);
        toI(a);
    }

    public static void toBinary(int a) {
        String b = Integer.toBinaryString(a);
        System.out.println(b);
    }

    public static void toOctal(int a) {
        String b = Integer.toOctalString(a);
        System.out.println(b);
    }

    public static void toHex(int a) {
        String b = Integer.toHexString(a);
        System.out.println(b);
    }

    public static void toH(int a) {
        try {
             short b = (short) a;
            System.out.println("yes");
        }catch (Exception in ) {
            System.out.println("no");
        }
    }
    public static void toI(int a) {
        try {
            byte b = (byte) a;
            System.out.println("yes");
        }catch (Exception in ) {
            System.out.println("no");
        }
    }
    if short == intgr i td
}
