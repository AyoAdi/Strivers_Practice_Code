package BinarySearch.OneD;

class optLowerBound{
    int outputt(int[] arr, int target){
        int output = -1;
        int low = 0; 
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(target <= arr[mid]){
                // low = mid + 1;
                // output = low;
                output = mid;
                high = mid-1;
            }else{
                low = mid + 1;
                output = low;
                // output = mid - 1;
                // high = output;
            }
        }
        return output;
    }
}


public class optimised_lower_bound_of_x {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int target = 2;
        optLowerBound olb = new optLowerBound();
        System.out.print(olb.outputt(arr, target));
    }
}
