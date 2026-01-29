package BinarySearch.OneD;

class lowerBound{
    int runThis(int[] arr, int target){
        int index = -1;

        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] >= target){
                index = i;
            }
        }
        return index;
    }
}


public class lower_bound_of_x {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int target = 9;
        lowerBound lb = new lowerBound();
        System.out.print(lb.runThis(arr, target));
    }
}
