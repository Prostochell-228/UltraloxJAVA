import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int N = scanner.nextInt();
        int x = 0;
        int C = 0;
        while (x != N) {
            if (C % 2 == 0 && C != 0) {
                System.out.print(C + " ");
                x++;
            }
            C++;
        }
    }
}