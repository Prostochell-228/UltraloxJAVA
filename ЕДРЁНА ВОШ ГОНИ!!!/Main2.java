import java.io.PrintStream;
import java.util.Scanner;

public class Main2 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String args[]) {
        int a = in.nextInt();
        int arr[] = new int[a];
        Fill(arr);
        int N = a;
        int index=0;
        for (int i=0; i<N; i++)
        {
            if (arr[i]<0&& arr[i - 1] >= arr[i] )
            {
                a=arr[i];
                arr[i]=arr[index];
                arr[index]=a;
                index++;
            }
        }

        Print(arr);

    }

    public static void Fill(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i] + " ");
        }
    }
}
считай +- и два массива
