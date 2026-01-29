package Arrays.Medium;


class Soluion {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int tempsum = 0;

        for(int i = 0; i < nums.length; i++){
            tempsum += nums[i];
            sum = Math.max(tempsum, sum);

            if(tempsum < 0){
                tempsum = 0;
            }
        }
        return sum;
    }
}

public class max_subarray {
    public static void main(String[] args) {
        int[] arr = {};
        Soluion s=new Soluion();
        System.out.print(s.maxSubArray(arr));
    }
}
