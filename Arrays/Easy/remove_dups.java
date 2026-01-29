package Arrays.Easy;
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int total = nums.length;
        int dupes = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                dupes++;
            }
        }
        int output = total - dupes;

        Set<Integer> s = new LinkedHashSet<>();

        for(int i = 0; i < nums.length; i++){
            s.add(nums[i]);
        }

        Integer[] outputhere = s.toArray(new Integer[0]);

        for(int i = 0; i < outputhere.length; i++){
            nums[i] = outputhere[i];
        }
        return output;
    }
}

class remove_dups{
    public static void main(String[] args) {
        int[] arr = {3,65,4,3,6,8,4,3};
        Solution sol = new Solution();
        System.out.print(sol.removeDuplicates(arr));
    }
}