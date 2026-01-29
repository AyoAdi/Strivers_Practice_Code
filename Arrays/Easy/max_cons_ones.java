package Arrays.Easy;

class Nn {
    public int MaxConsecutives(int[] nums) {
        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                if(count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if(count > maxCount){
            maxCount = count;;
        }
        return maxCount;
    }
}

public class max_cons_ones {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,1,1};
        Nn n = new Nn();
        System.out.print(n.MaxConsecutives(arr));
    }
}
