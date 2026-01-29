package Sorting;
import java.util.Arrays;

//Hashed parts can be used to optimise the code. It does not change how the code fundamentally works.

class sortTS {
    int[] output(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            //boolean swapped = false;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //swapped = true;
                }
            }
            // if(swapped == false){
            //     break;
            // }
        }
        return arr;
    }
}

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 3, 7};
        sortTS st = new sortTS();
        System.out.println(Arrays.toString(st.output(arr)));
    }
}



