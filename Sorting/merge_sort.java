package Sorting;

public class merge_sort{
    public static void main(String[] args) {
        int[] arr = {6,4,9,8,0,34};
        execute(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void execute(int[] arr){
        int len = arr.length;


        if(len <= 1){
            return;
        }// Base Class

        int mid = len/2;

        int[] leftArray = new int[mid];//Stores arr till mid
        int[] rightArray = new int[len - mid]; // Stores arr till

        int i = 0; int j = 0;
        for(; i < arr.length; i++){
            if(i < mid){
                leftArray[i] = arr[i];
            }else{
                rightArray[j] = arr[i];
                j++;
            }
        }
        execute(leftArray);
        execute(rightArray);
        merge(leftArray, rightArray, arr);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] arr){
        int leftSize = arr.length/2;
        int rightSize = arr.length - leftSize;

        int i = 0;
        int r = 0;
        int l = 0;

        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                arr[i] = leftArray[l];
                l++;
                i++;
            }else{
                arr[i] = rightArray[r];
                r++;
                i++;
            }
        }

        while(l < leftSize){
            arr[i] = leftArray[l];
            l++;
            i++;
        }
        while(r < rightSize){
            arr[i] = rightArray[r];
            r++;
            i++;
        }
    }
}
