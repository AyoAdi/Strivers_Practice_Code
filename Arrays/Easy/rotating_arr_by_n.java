package Arrays.Easy;
// This is my approach, most optimal way is to use recursion
class executeThisCode{
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // For when k is much, much bigger than the length of the array
        for(int i = 0; i < k; i++){
            int key = nums[nums.length-1];
            int j = nums.length-2;
            while(j >= 0){
                nums[j+1] = nums[j];
                j--;
            }
            nums[0] = key;
        }
    }
}


public class rotating_arr_by_n {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        executeThisCode etc = new executeThisCode();
        etc.rotate(arr, 2);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


//recursion code:
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k %= n;

//         reverse(nums, 0, n - 1);
//         reverse(nums, 0, k - 1);
//         reverse(nums, k, n - 1);
//     }

//     private void reverse(int[] nums, int l, int r) {
//         while (l < r) {
//             int temp = nums[l];
//             nums[l] = nums[r];
//             nums[r] = temp;
//             l++;
//             r--;
//         }
//     }
// }
