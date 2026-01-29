package BinarySearch.OneD;

//TC = O(logN), SC = O(logN)
class recursiveBinary{
    int execute(int[] arr, int low, int high, int target){
        while(low <= high){
            int mid = low + (high-low)/2;
            //if mid value is equal to target
            if(arr[mid] == target){
                return mid;
            }

            // if mid value is greater than target
            if(arr[mid]< target){
                return execute(arr, mid + 1, high, target);
            }

            return execute(arr, low, mid-1, target);
        }

        return -1;
    }
}


public class recursive_find_ele_using_binary {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,10,20};
        int target = 10;
        recursiveBinary rb = new recursiveBinary();
        System.out.print(rb.execute(arr, 0, arr.length-1, target));

    }
}
