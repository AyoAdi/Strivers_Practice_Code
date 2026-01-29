package Sorting;
import java.util.Arrays;

class sortTsS {
    int[] output(int[] arr) {

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            //Loop goes from i-1 to 0, compares the values with presval, and sorts them
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 3, 7};
        sortTsS st = new sortTsS();
        System.out.println(Arrays.toString(st.output(arr)));
    }
}
