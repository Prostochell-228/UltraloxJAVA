import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

    }

    private void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currntElement = array[i];

            int index = i - 1;
            while (index >= 0 && array[index] > currntElement) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = currntElement;
        }
    }
    private  static void quikSort(int[]array,int low, int high){
        if(array.length ==0){
            return;
        }
        if (low>=high){
            return;
        }
        int middleIndex = low +(high+low)/2;
        int pivot = array[middleIndex];

        int i = low;
        int j = high;

        while (i<=j){
            while (array[i]>pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }
            if (i<=j){
                int temp = array[i];
                array[i]= array[j];
                array[j]= temp;

                i++;
                j--;
            }

        }
        if (low< j){
            quikSort(array, low , j);
        }
        if (high> i){
            quikSort(array,i, high);
        }
    }
}