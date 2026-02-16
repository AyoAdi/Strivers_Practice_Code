package BinarySearch.Answers;

class smallestDivisorInAThresholdNotOpt{
    //Unoptimised Code, gives output in TC = O(maxVal*N)
    int getDiv(int[] arr, int threshold){

        if(arr.length == 0){
            return -1;
        }

        //getting max value in array
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }

        for(int i = 1; i <= maxVal; i++){
            //looping the array
            int divsum = 0;
            for(int j = 0; j < arr.length; j++){
                divsum += Math.ceilDiv(arr[j], i);
            }

            if(divsum <= threshold){
                return i;
            }
        }

        return -1;
    }
    //More optimised, gives TC = O(Nlog(M))
    int getDivisorVal(int[] arr, int threshold){
        if(arr.length == 0){
            return -1;
        }

        int i = 1;
        int j = 0;

        //getting max value
        for(int x = 0; x < arr.length; x++){
            if(arr[x] > j){
                j = arr[x];
            }
        }

        int out = j;

        while(i <= j){
            int mid = i + (j-i)/2;
            int divsum = 0;
            for(int k = 0; k < arr.length; k++){
                divsum += Math.ceilDiv(arr[k], mid);
            }

            if(divsum <= threshold){
                out = Math.min(out, mid);
            }

            if(divsum > threshold){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return out;
    }
}


public class smallest_divisor_in_a_threshold {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshold = 6;

        //System.out.print(s.getDiv(arr, threshold));

        smallestDivisorInAThresholdNotOpt s = new smallestDivisorInAThresholdNotOpt();
        System.out.print(s.getDivisorVal(arr, threshold));
    }
}
