package Arrays.Medium;
//Time complexity is O(n^3), abyssmal, but correct
class subarrSumEqK{
    int totalling(int[] arr, int k){
        int n = arr.length;
        int count = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                //Summing and checking
                sum = sum(arr, i, j);
                if(sum == k){
                    count++;
                }
                sum = 0;
            }
        }
        return count;
    }

    int sum(int[] arr, int upper, int lower){
        int sum = 0;
        for(int i = upper; i <= lower; i++){
            sum = sum + arr[upper];
        }
        return sum;
    }
}


public class bruteforce_subarr_sum_eq_k {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        subarrSumEqK sek = new subarrSumEqK();
        System.out.print(sek.totalling(arr, 2));
    }
}
