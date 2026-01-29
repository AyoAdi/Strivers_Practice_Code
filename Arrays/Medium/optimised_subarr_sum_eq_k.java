package Arrays.Medium;
import java.util.HashMap;;
class thisIsLit{
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int preSum[] = new int[n];
        preSum[0] = nums[0];
        for(int i=1; i<n; i++){
            preSum[i] = preSum[i-1] + nums[i];
        }
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int j=0; j<n; j++){
            if(preSum[j] == k){
                count++;
            }
            int val = preSum[j] - k;

            if(m.containsKey(val)){
                count += m.get(val);
            }
            
            m.put(preSum[j], m.getOrDefault(preSum[j],0) + 1);
       
        }

       return count;
    }
}


public class optimised_subarr_sum_eq_k {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        thisIsLit t = new thisIsLit();
        System.out.print(t.subarraySum(arr, k));
    }
}
