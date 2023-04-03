import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFuller {
    public static ArrayList AMIGUS(ArrayList LoxARR){
        Scanner inj = new Scanner(System.in);
        System.out.println("Введи значение");
        int LeN = inj.nextInt();
        int j;
        for (int i  =0; LeN > i; LeN--){
             j = inj.nextInt();
            LoxARR.add(j);
        }
     return LoxARR;
    }
}
