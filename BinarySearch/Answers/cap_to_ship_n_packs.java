package BinarySearch.Answers;

class capToShipNPackages{

    //Brute force, TC = O(sum(arr) * N)
    int getMinWt(int[] arr, int days){

        if(arr.length == 0){
            return -1;
        }

        if(arr.length == 1){
            return arr[0];
        }
        int minwt = Integer.MIN_VALUE;
        int maxwt = 0;
        for(int i = 0; i < arr.length; i++){
            maxwt += arr[i];
            if(arr[i] > minwt){
                minwt = arr[i];
            }
        }

        while(minwt <= maxwt){
            int temp = 0;
            int dayct = 0;
            boolean traversedArr = true;

            //traversing the array
            for(int i = 0; i < arr.length-1; i++){
                if(dayct > days){
                    traversedArr = false;
                    break;
                }
                temp += arr[i];

                if(temp + arr[i+1] > minwt || temp == minwt){
                    dayct++;
                    temp = 0;
                }
            }

            temp += arr[arr.length-1];
            if(temp <= minwt){
                dayct++;
            }
        
            if(dayct <= days && traversedArr == true){
                return minwt;
            }
            minwt++;
        }
        return -1;
    }
    //Binary search
    int getMinWtEff(int[] arr, int days){
        if(arr.length == 0){
            return -1;
        }

        if(arr.length == 1){
            return arr[0];
        }
        int minwt = Integer.MIN_VALUE;
        int maxwt = 0;
        for(int i = 0; i < arr.length; i++){
            maxwt += arr[i];
            if(arr[i] > minwt){
                minwt = arr[i];
            }
        }

        int out = 0;

        while(minwt <= maxwt){
            int temp = 0;
            int dayct = 0;
            //boolean traversedArr = true;
            int mid = minwt + (maxwt - minwt)/2;
            
            for(int i = 0; i < arr.length; i++){
                if(dayct > days){
                    //traversedArr = false;
                    break;
                }

                if(temp + arr[i] > mid ){
                    dayct++;
                    temp = 0;
                }
                temp += arr[i];
            }

            if(temp <= mid){
                dayct++;
            }

            if(dayct <= days){
                out = mid;
            }

            if(dayct > days){
                minwt = mid+1;
            }else{
                maxwt = mid-1;
            }
        }
        return out;
    }
}


public class cap_to_ship_n_packs {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        capToShipNPackages c = new capToShipNPackages();
        System.out.print(c.getMinWtEff(weights, days));
    }
}
