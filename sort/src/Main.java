import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> LoxARR = new ArrayList<Integer>();
        int [] spisok = {2,3,5,211,23};
        int buf = 0;
        int bin = 5;
        int r = spisok.length - 1;
        int l = 0;

        System.out.println(BinaryLOX.loxus(spisok,bin, l, r));
        SearchLOX.lox(spisok, buf);
        System.out.println(BinaryLOX.loxus(spisok,bin, l, r));
        System.out.println(Arrays.toString(spisok));
    }

}