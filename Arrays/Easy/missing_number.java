package Arrays.Easy;
import java.util.Arrays;

class OutputHere {
    public int missingNumberIG(int[] nums) {
        //Sorting the array
        
        Arrays.sort(nums);
        int i = 0;
        int range = nums.length;

        while(i < range){
            if(nums[i] != i){
                return i;
            }else{
                i++;
            }
            
        }
        return i;
    }
}



public class missing_number {
    public static void main(String[] args) {
        OutputHere s = new OutputHere();
        int[] nums = {0,1,3};
        System.out.print(s.missingNumberIG(nums));
    }
}
