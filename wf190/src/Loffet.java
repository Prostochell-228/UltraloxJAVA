import java.util.Locale;
import java.util.Scanner;

public class Loffet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int N = scanner.nextInt();
        int n2 = N;
        int summ = 0;
        int count = N;
        if (N==1){
            System.out.println(3);
        }
        while (true) {
            n2++;
            while (count != 1) {
                count--;
                if (n2 % count == 0) {
                    summ++;
                }
            }
            if (summ == 1) {
                System.out.println(n2);
                break;
            }
            summ = 0;
            count = N;
        }
    }
}