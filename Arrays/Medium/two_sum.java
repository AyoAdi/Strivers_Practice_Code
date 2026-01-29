package Arrays.Medium;
import java.util.*;

//Non-optimised solution/Brute Force solution
class executed{
    int[] twoSum(int[] nums, int target){
        int[] output = new int[2];


        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];

            for(int j = i+1; j <= nums.length-1; j++){
                if(temp + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }

        return output;
    }
}


public class two_sum {
    public static void main(String[] args){
        int[] arr = {3,2,4};
        int target = 6;

        executed e = new executed();
        System.out.print(Arrays.toString(e.twoSum(arr, target)));
    }
}
