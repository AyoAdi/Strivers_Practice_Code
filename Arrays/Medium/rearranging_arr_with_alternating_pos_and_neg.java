package Arrays.Medium;
import java.util.Arrays;
class sol {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] pos = new int[len/2];
        int[] neg = new int[len/2];

        int posIdx = 0;
        int negIdx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pos[posIdx] = nums[i];
                posIdx++;
            }else{
                neg[negIdx] = nums[i];
                negIdx++;
            }
        }
        posIdx = 0;
        negIdx = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0){
                nums[i] = pos[posIdx];
                posIdx++;
            }else{
                nums[i] = neg[negIdx];
                negIdx++;
            }
        }
        return nums;
    }
}


public class rearranging_arr_with_alternating_pos_and_neg {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        sol so = new sol();
        System.out.print(Arrays.toString(so.rearrangeArray(arr)));
    }
}
