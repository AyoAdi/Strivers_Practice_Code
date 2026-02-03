package BinarySearch.OneD;

//O(N) TC, just wanted to try before i go for binary search method
class nonOptSingleEle{
    int outout(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0;i < nums.length-2; i += 2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

//More optimised, does the jon in TC = O(N/2) -> O(N). Iam able to figure everything except O(LogN) lol
class aLittleOptSingleEle{
    int output(int[] arr){
        int low = 0;
        int high = arr.length-1;
        if(arr.length == 1){
            return arr[0];
        }

        while(low <= high){
            if(arr[low] != arr[low+1]){
                return arr[low];
            }
            if(arr[high] != arr[high-1]){
                return arr[high];
            }
            low = low + 2;
            high = high - 2;
        }
        return -1;
    }
}

public class non_opt_single_ele_in_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {1};

        nonOptSingleEle nos = new nonOptSingleEle();
        System.out.print(nos.outout(arr));
    }
}
