package BinarySearch.OneD;

class findPeakElement{
    int getIdx(int[] arr){
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }

        if(arr[0] > arr[1]){
            return 0;
        }

        if(arr[n-1] > arr[n-2]){
            return n-1;
        }

        int low = 0;
        int high = n-2;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] > arr[mid+1]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return -1;
    }
}

public class peak_element {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        findPeakElement fpe = new findPeakElement();
        System.out.print(fpe.getIdx(arr));
    }
}
