package BinarySearch.OneD;

class rotatedArrCount{
    int getOutput(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}


public class times_arr_is_rotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        rotatedArrCount rac = new rotatedArrCount();
        System.out.print(rac.getOutput(arr));
    }
}
