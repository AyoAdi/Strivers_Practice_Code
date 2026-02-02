package BinarySearch.OneD;
import java.util.Arrays;
class floorAndCeilBest{
    int[] output(int[] arr, int target){
        //Array should be sorted for binary search to work
        //Tc = O(logN)
        int floor = Integer.MIN_VALUE;
        int ceiling = Integer.MAX_VALUE;

        //getting floor
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= target){
                floor = Math.max(floor, arr[mid]);
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        low = 0;
        high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                ceiling = Math.min(ceiling, arr[mid]);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        int[] out = {floor,ceiling};
        if(out[0] == Integer.MIN_VALUE){
            out[0] = -1;
        }
        if(out[1] == Integer.MAX_VALUE){
            out[1] = -1;
        }
        return out;
    }
}

public class floor_and_ceil_best {
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        int target = 5;

        floorAndCeilBest fcb = new floorAndCeilBest();
        System.out.print(Arrays.toString(fcb.output(arr, target)));
    }
}
