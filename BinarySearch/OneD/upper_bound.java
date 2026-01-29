package BinarySearch.OneD;

class upperBound{
    int uperobund(int[] arr, int target){
        int output = -1; //Edge case
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            //If the target value is greater than the value at mid index, high should be lesser than mid to find smaller indexes
            //Else, increase the low value and search after mid
            if(arr[mid] > target){
                output = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return output;
    }
}


public class upper_bound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int target = 9;

        upperBound ub = new upperBound();
        System.out.print(ub.uperobund(arr, target));
    }
}
