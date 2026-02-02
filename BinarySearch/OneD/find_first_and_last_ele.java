package BinarySearch.OneD;
import java.util.Arrays;
class firstAndLastPoss{
    int[] result(int[] arr, int target){
        int[] out = {-1,-1};

        if(arr.length == 0) return out;

        //First occurence
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        if(low >= arr.length || arr[low] != target) return out;
        out[0] = low;

        //Second Occurence

        low = 0;
        high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        out[1] = high;
        return out;
    }
}


public class find_first_and_last_ele {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        firstAndLastPoss fl = new firstAndLastPoss();
        System.out.print(Arrays.toString(fl.result(arr, target))); 
    }
}
