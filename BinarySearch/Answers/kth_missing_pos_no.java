package BinarySearch.Answers;

class kthMissPosNoNotEff{
    //Brute force, works well. TC = O(maxVal*N)
    int getNumber(int[] arr, int k){
        if(arr.length == 0){
            return -1;
        }
        int maxVal = arr[arr.length-1] + k;
        int i = 1;
        int count = 0;
        int out = 0;

        while(i <= maxVal){
            boolean isThere = false;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    isThere = true;
                    break;
                }
            }

            if(isThere == false){
                count++;
            }

            if(count == k){
                out = i;
                break;
            }
            i++;
        }
        return out;
    }

    //Yeah I couldnt come up with this shit lmao. TC = O(LogN)
    int efficientgetNo(int[] arr, int k){
        if(arr.length == 0){
            return -1;
        }
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            int mid = i + (j-i)/2;

            int missNo = arr[mid] - (mid+1);

            if(missNo < k){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }

        return i + k;
    }
}



public class kth_missing_pos_no {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;

        kthMissPosNoNotEff km = new kthMissPosNoNotEff();
        //System.out.print(km.getNumber(arr, k));
        System.out.print(km.efficientgetNo(arr, k));
    }
}
