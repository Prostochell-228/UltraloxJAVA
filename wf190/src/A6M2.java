import java.util.Locale;
import java.util.Scanner;

public class A6M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        int n2 = n;
        int count = 0;
        while (n2 != 0) {
            if (n%n2==0){
                count++;
            }
            n2--;
        }
        if (count>2){
            System.out.println("composite");
        }
        else{
            System.out.println("prime");
        }
    }
}
