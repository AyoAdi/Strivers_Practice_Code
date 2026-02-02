//test ground, i try stuff here


package BinarySearch.OneD;
import java.util.Arrays;

class testingTs{
    int[] outputTs(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int max_val = target;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] > max_val){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(low >= arr.length){
            low = arr.length-1;
        }
        int[] out = {arr[low],arr[high]};
        return out;
    }
}

//We can use this binary search to send the max value and its index to the other function, and use that to split the array into two parts.
//Then we can use binary search to find the target index
//I mightve cracked it ngl
//NVM i almost got it, better luck next time
public class test_bs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = arr[0];

        testingTs t = new testingTs();
        System.out.print(Arrays.toString(t.outputTs(arr, target)));
    }
}
