package BinarySearch.Answers;

class medianOfArrs{

    //O(n) Time complexity, i didnt check edge cases, im done
    float getMedian(int[] arr1, int[] arr2){
        int arr1len = arr1.length;
        int arr2len = arr2.length;
        if(arr1len == 0){
            if(arr2len % 2 == 0){
                return (float)((arr2[arr2len/2] + arr2[(arr2len/2) - 1]) / 2);
            }else{
                return (float)(arr2[arr2len/2]);
            }
        }

        if(arr2len == 0){
            if(arr2len % 2 == 0){
                return (float)((arr1[arr1len/2] + arr1[(arr1len/2) - 1]) / 2);
            }else{
                return (float)(arr1[arr1len/2]);
            }
        }
        int sum = arr2len + arr1len;
        int j = 0; // 
        int i = 0;
        int count = 0;
        int target = 0;

        if(sum % 2 != 0){
            target = sum / 2;
        }else{
            target = (sum / 2) - 1;
        }

        System.out.println(target);

        while(count < target){
            if(arr1[i] < arr2[j]){
                i++;
                count++;
            }else{
                j++;
                count++;
            }
        }
        
        if(sum % 2 != 0){
            if(arr1[i] < arr2[j]){
                return (float)arr1[i];
            }else{
                return (float)arr2[j];
            }
        }  
        return (float)(arr1[i] + arr2[j])/2;
    }

}


public class median_of_two_sorted_arr {
    public static void main(String[] args) {
        //int[] arr1 = {1,3,4,8};
        //int[] arr2 = {2,5,6,7};
        //int[] arr2 = {};

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,5,6};
        medianOfArrs m = new medianOfArrs();
        System.out.print(m.getMedian(arr1, arr2));
    }
}
