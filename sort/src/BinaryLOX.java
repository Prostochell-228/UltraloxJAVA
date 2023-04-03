public class BinaryLOX {
    public static int loxus(int[] spisok, int bin, int l, int r){
        if(l == r) {
            return (spisok[l] == bin)? l : -1;
        }
        int m = l + (r-l)/2;
        if (bin > spisok[m]) {
            return loxus(spisok, bin, m+1, r);
        } else if (spisok[m]>bin) {
            return loxus(spisok, bin, l,m-1);
        }
        return m;
    }
}