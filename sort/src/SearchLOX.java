public class SearchLOX {
    public static int[] lox(int[] spisok, int buf){
        boolean isSort = false;

        while(!isSort){
            isSort = true;
            for (int i = 0; i < spisok.length-1; i++){
                if (spisok[i]>spisok[i+1]){
                    isSort=false;
                    buf=spisok[i];
                    spisok[i]=spisok[i+1];
                    spisok[i+1] = buf;
                }
            }
        }
        return spisok;
    }
}
