package Arrays.Medium;

class Soluti {
    public int majorityElementt(int[] nums) {
        int count = 0;
        int element = 0;

        
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}

public class maj_ele_opt {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        Soluti si = new Soluti();

        System.out.print(si.majorityElementt(arr));
    }
}
