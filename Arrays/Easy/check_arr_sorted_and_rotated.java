package Arrays.Easy;
import java.util.Arrays;
 
class Solutionn {
    public boolean check(int[] nums) {
        int[] dup = nums.clone();
        Arrays.sort(dup);

        if(Arrays.equals(nums,dup)){
            return true;
        }
        for(int i = 0; i < nums.length-1; i++){
            int last = nums[nums.length - 1];
            for(int j = nums.length-1; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = last;
            if(Arrays.equals(nums,dup)){
                return true;
            }
        }
        return false;

    }
}


public class check_arr_sorted_and_rotated {
    public static void main(String[] args) {
        Solutionn soln = new Solutionn();
        int[] arr = {2,5,7,4,2,7};

        System.out.print(soln.check(arr));
    }
}
