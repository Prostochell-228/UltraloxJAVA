import java.util.Locale;
import java.util.Scanner;

public class He122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] A = new int [n][m];
        for (int j= 0; j<n; j++) {
            for (int i = 0; i < m; i++) {
                if (j%2==0){
                    A[j][i]=j*m+(m-i-1);
                }
                else{
                    A[j][i]=j*m+j;
                }
            }
        }
        for (int j= 0; j<A.length; j++) {
            for (int i = 0; i < A[j].length; i++) {
                System.out.printf("%3d",A[j][i]);
            }
            System.out.println();
        }
    }
}