package BinarySearch.OneD;

//TC = O(logN)
class countOccurencesInDupSortedArr{
    int output(int[] arr, int target){
        int firstOccurence = -1;
        int lastOccurence = -1;
        //Determining first occurence
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                firstOccurence = mid;
            }

            if(arr[mid] >= target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        //Getting last occurence
        low = 0;
        high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                lastOccurence = mid;
            }

            if(arr[mid] <= target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        int count = (lastOccurence - firstOccurence) + 1;
        return count;
    }
}


public class count_occurences_in_dup_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,3,3,4};
        int target = 3;

        countOccurencesInDupSortedArr co = new countOccurencesInDupSortedArr();
        System.out.print(co.output(arr, target));
    }
}
