package Arrays.Medium;
import java.util.Arrays;
class SoluT{
    int[] nextPerm(int[] arr){
        int pivot = -1;

        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(arr, 0,arr.length-1);
            return arr;
        }

        //Finding the smallest val after pivot greater than pivot val
        int smallestidx = -1;
        for(int i = pivot + 1; i < arr.length; i++){
            if(arr[i] > arr[pivot]){
                smallestidx = i;
            }
        }
        //Swap
        if(pivot != -1){
            int temp = arr[pivot];
            arr[pivot] = arr[smallestidx];
            arr[smallestidx] = temp;
        }
        
        //Rotating the array to the right
        // int j = arr.length-2;
        // int lastVal = arr[arr.length-1];
        // while(j > pivot){
        //     arr[j+1] = arr[j];
        //     j--;
        // }
        // arr[pivot+1] = lastVal;

        //Reversing the array
        
        reverse(arr, pivot + 1, arr.length-1);
        return arr;

    }

    int[] reverse(int[] arr, int startIdx, int lastIdx){
        int i = startIdx;
        int j = lastIdx;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}

public class next_perm {
    public static void main(String[] args) {
        //int[] arr = {1,5,8,4,7,6,5,3,1};
        int[] arr = {3,2,1};
        SoluT sol = new SoluT();
        System.out.print(Arrays.toString(sol.nextPerm(arr)));
    }
}
