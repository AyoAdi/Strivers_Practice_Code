package BinarySearch.OneD;

class findMinInSortedArr{
    int getOutput(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return arr[low];
    }
}


public class find_min_in_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        findMinInSortedArr f = new findMinInSortedArr();
        System.out.print(f.getOutput(arr));
    }   
}
