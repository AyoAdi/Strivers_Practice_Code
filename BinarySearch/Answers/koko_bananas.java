package BinarySearch.Answers;

class kokoBananas{

    //Not optimised at all, gives output in O(N*M) time, kinda shit
    int getOutput(int[] arr, int h){
        int count = 0;
        int output = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        //int maxVal = getMaxVal(arr);
        //Getting max value cam be done using binary search as well
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }

        for(int i = 1; i <= maxVal; i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                int extraval = 0;
                if(arr[j]% i == 0){
                    extraval = arr[j]/i;
                }else{
                    extraval = 1 + arr[j]/i;
                }
                count += extraval;

                if(count > h){
                    break;
                }  
            }
            if(count <= h){
                output = Math.min(output, i);
            }
        }
        return output;
    }
    //Optimised using binary search
    int getOutputOptimised(int[] arr, int h){
        int low = 1;
        int maxVal = Integer.MIN_VALUE;
        //int maxVal = getMaxVal(arr);
        long count = 0;
        int out = Integer.MAX_VALUE;
        //finding max val in array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }

        int high = maxVal;

        while(low <= high){
            count = 0;
            long mid = low + (high-low)/2;

            //traversing the array to check
            for(int i = 0; i < arr.length; i++){
                long addval = 0;
                if(arr[i]% mid == 0){
                    addval = arr[i] / mid;
                }else{
                    addval = 1 + arr[i]/mid;
                }
                count += addval; 
                if(count > h){
                    break;
                }
            }

            if(count > h){
                low = (int)mid + 1;
            }
            else{
                out = (int)Math.min(out, mid);
                high = (int)mid-1;
            }
                
        }
        return out;
    }
    //This method seems to work in some cases, but not in most
    //int getmaxVal(int[] arr){
    //    int low = 0;
    //    int high = arr.length-1;
    //    while(low < high){
    //        int mid = low + (high-low)/2;
    //        if(arr[high] <  arr[low]){
     //           high = mid;
    //        }else{
    //            low  = mid+1;
    //        }
    //    }
    //    return arr[high];
    //}
}

public class koko_bananas {
    public static void main(String[] args) {
        int[] arr = {3,6,7,100,1,1,1,1,1};
        int h = 5;

        kokoBananas kb = new kokoBananas();
        System.out.print(kb.getOutputOptimised(arr, h));
        //System.out.print(kb.getmaxVal(arr));

    }
}
