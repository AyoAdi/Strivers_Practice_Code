package BinarySearch.Answers;

//Genuie first attempt, horrible TC = O(maxVal*N), but it works well surprisingly
//IT PASSED 83/93 TCS???? OKAY OKAY
class daysToMakeBoquet{
    int getNoOfBoquets(int[] arr, int m, int k){
        if(m*k > arr.length){
            return -1;
        }

        //Getting max day
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }

        
        for(int i = minVal; i <= maxVal; i++)
        {
            int tempct = 0;
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] <= i){
                    tempct++;
                }else{
                    tempct = 0;
                }

                if(tempct == k){
                    count++;
                    tempct = 0;
                }
            }

            if(count >= m){
                return i;
            } 
        }
        return -1;
    }


//     int getConsCount(int[] arr, int k){
//         int tempct = 0;
//         int finalct = 0;
//         for(int i = 0; i < arr.length; i++){
            
//             if(arr[i] == -1){
//                 tempct++;
//             }else{
//                 tempct = 0;
//             }

//             if(tempct == k){
//                 finalct++;
//                 tempct = 0;
//             }
//         }
//         return finalct;
//     }
}


public class days_to_make_m_boquets {
    public static void main(String[] args) {
        //int[] bloomDay = {1,10,3,10,2};
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;

        daysToMakeBoquet d = new daysToMakeBoquet();
        System.out.print(d.getNoOfBoquets(bloomDay, m, k));
    }
}
