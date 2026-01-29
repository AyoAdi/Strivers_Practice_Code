package Arrays.Easy;

class findEle{
    int executeThisArr(int[] arr){
        int largest = arr[0];
        //getting largest element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int secondlargest = Integer.MIN_VALUE;
        //getting second largest element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < largest && arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    
}



public class second_larg_without_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,7,8,3,2,4,5,1,0,9,99};
        findEle fe = new findEle();
        System.out.print(fe.executeThisArr(arr));
    }
}
