package Sorting;
import java.util.Arrays;

//Tried insertion sort by myself, came up with this naive seletiion-swap based sort-type code
class sTemp {
    int[] output(int[] arr) {
        for(int i = 1; i <= arr.length-1; i++){

            //Loop goes from 0 to i-1, comapres the values with presval, and sorts them
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}

public class custom_code {
    public static void main(String[] args) {
        int[] arr = {9,7,4,1,-6,20,6};
        sTemp st = new sTemp();
        System.out.println(Arrays.toString(st.output(arr)));
    }
}