package Arrays.Easy;

//This is a little better than brute force, but not the most optimised
//This is for positive arrays only

class toBeExecited{
    int exec(int[] a, int k){
        int start = 0;
        int max_len = -1;
        while(start != a.length){
            int sum = 0;
            int len = 0;
            for(int i = start; i < a.length; i++){
                sum = sum + a[i];
                len++;
                if(sum > k){
                    break;
                }

                if(sum == k){
                    max_len = Math.max(max_len, len);
                }
            }
            start++;
        }   
        return max_len;
    }
}


public class max_len_with_sum {
    public static void main(String[] args) {
        int[] a = {2,3,5,7,4,1};
        int total = 12;
        toBeExecited tbe = new toBeExecited();
        System.out.print(tbe.exec(a, total));
    }
}
