package BinarySearch.OneD;

class searchInsertPos{
    int result(int[] arr, int low, int high, int target){
        int out = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return mid;
            }

            //If the target value is less than mid val, then store mid val temporarily in out, and bring high to be 1 less than mid
            if(target < arr[mid]){
                out = mid;
                high = mid-1;
            }
            //Else, store out value as mid+1, and increase low val as the same. This is to consider situation where taeget is greater than all values of array
            else{
                out = mid+1;
                low = mid+1;
            }
        }
        return out;
    }
}


public class search_insert_pos {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;

        searchInsertPos sip = new searchInsertPos();
        System.out.print(sip.result(arr, 0, arr.length-1, target));
    }
}
