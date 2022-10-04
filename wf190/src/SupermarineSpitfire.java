import java.util.Locale;
import java.util.Scanner;

public class SupermarineSpitfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double aor = a;
        int n2 = n/2;
        if (n%2==0&&n2!=1&&n!=0){
            while (n!=0){
                a=a*aor;
                n--;
            }
            System.out.println(a/aor);
        }
        else if (n%2!=0&&n!=1){
            while (n!=0){
                a=a*aor;
                n--;
            }
            System.out.println(a/aor);

        }
        else if (n2==1){
            System.out.println(a*a);
        }
        else if (n==1){
            System.out.println(a);
        }
        else if (n==0){
            System.out.println(1);
        }
    }
}