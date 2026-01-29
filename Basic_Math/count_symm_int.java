package Basic_Math;
import java.util.Scanner;
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int sum = 0;
        for(int i = low; i < high+1; i++){    
            String s = Integer.toString(i);
            if(s.length()%2 != 0){
                continue;
            }
            int max_ops = s.length()/2;
            int count = 0;
            int x = 0;
            int j = s.length()-1;
            int leftsum = 0;
            int rightsum = 0;

            while(count != max_ops){
                String left = Character.toString(s.charAt(x));
                String right = Character.toString(s.charAt(j));
                int l = Integer.parseInt(left);
                int r = Integer.parseInt(right);
                leftsum = leftsum + l;
                rightsum = rightsum + r;
                x++;
                j--;;
                count++;
            }

            if(leftsum == rightsum){
                sum++;
            }
        }
        return sum;
    }
}

public class count_symm_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower value: ");
        int low = sc.nextInt();
        System.out.print("Enter the higher value: ");
        int high = sc.nextInt();
        Solution sol = new Solution();
        System.out.print(sol.countSymmetricIntegers(low, high));
        sc.close();
    }
}
