package BinarySearch.OneD;
import java.util.Arrays;
//Same question, but done in O(n) time complexity
class floowAndCeil{
    int[] output(int[] arr, int target){
        int floor = Integer.MIN_VALUE;
        int ceiling = Integer.MAX_VALUE;

        //floor
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= target && arr[i] >= floor){
                floor = Math.max(floor, arr[i]);
            }
        }

        //ceiling
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] >= target && arr[i] <= ceiling){
                ceiling = Math.min(ceiling,arr[i]);
            }
        }

        int[] out = {floor,ceiling};
        return out;
    }
}


public class floow_and_ceil_less_eff {
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        
        //int target = 5;
        int target = 8;
        floowAndCeil fc = new floowAndCeil();
        System.out.print(Arrays.toString(fc.output(arr, target)));
    }
}
