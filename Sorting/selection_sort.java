package Sorting;
import java.util.Arrays;

class sortTs {
    int[] output(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i; // reset for each pass

            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 3, 7};
        sortTs st = new sortTs();
        System.out.println(Arrays.toString(st.output(arr)));
    }
}
