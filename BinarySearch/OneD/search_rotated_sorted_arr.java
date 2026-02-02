package BinarySearch.OneD;

class searchRotatedSortedArr{
    int output(int[] arr, int target){
        int maxIdx = getMaxIndex(arr);
        int low = 0;
        int high = 0;

        if(target >= arr[low] && target <= arr[maxIdx]){
            high = maxIdx;
        }else{
            low = maxIdx+1;
            high = arr.length-1;
        }

        int output = binarySearchAlg(arr, low, high,target);
        return output;
    }

    int binarySearchAlg(int[] arr, int low, int high, int target){
        int out = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                out = mid;
                return mid;
            }
            if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return out;
    }

    int getMaxIndex(int[] nums){
        int low = 0; 
        int high = nums.length-1;
        if(nums[low] <= nums[high]){
            return high;
        }

        while(low <= high){
            int mid = low + (high-low)/2;
            //usually when the largest element is present, the next element will be smaller, if arr is rotated
            if(mid < nums.length-1 && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(nums[mid] <= nums[low]){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}

public class search_rotated_sorted_arr {
    public static void main(String[] args) {
        //int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {3,1};
        int target = 1;

        searchRotatedSortedArr sr = new searchRotatedSortedArr();
        System.out.print(sr.output(arr, target));
    }
}
