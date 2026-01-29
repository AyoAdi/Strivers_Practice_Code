package Arrays.Medium;
import java.util.*;

class SolutioN {
    public int majorityElement(int[] nums) {
        int max = 0;
        if(nums.length%2 != 0){
            max = (nums.length/2) + 1;
        }else{
            max = nums.length/2;
        }
        
        Set<Integer> s = new HashSet<>();

        //Inserting elements into set
        for(int i = 0; i < nums.length; i++){
            s.add(nums[i]);
        }

        int result = 0;
        for(int val : s){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == val){
                    count++;
                }
            }
            if(count >= max){
                result = val;
            }
        }
        return result;
    }
}

public class maj_element_naive {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        SolutioN sn = new SolutioN();

        System.out.print(sn.majorityElement(arr));


    }
}
