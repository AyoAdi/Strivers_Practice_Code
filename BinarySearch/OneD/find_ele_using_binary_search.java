package BinarySearch.OneD;

class binarySearch{
    int output(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            //If mid value is equal to target
            if(arr[mid] == target){
                return mid;
            }

            //if mid value is greater than target
            if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }


        return -1;
    }
}


public class find_ele_using_binary_search {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,10,20};
        int target = 11;

        binarySearch bs = new binarySearch();
        System.out.print(bs.output(arr, target));
    }
}
