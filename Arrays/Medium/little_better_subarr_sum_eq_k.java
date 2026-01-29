package Arrays.Medium;

class littleBetter{
    int printTs(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                sum = sum + arr[j];
                if(sum == k){
                    count++;
                }
                sum = 0;
            }
        }
        return count;
    }
}

public class little_better_subarr_sum_eq_k {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;

        littleBetter lb = new littleBetter();
        System.out.print(lb.printTs(arr, k));

    }
}
