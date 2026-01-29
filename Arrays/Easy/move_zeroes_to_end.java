package Arrays.Easy;

class executeTShi{
    void outputt(int[] arr){
        int i = 0;
        int end = arr.length - 1;

        while(i <= end){
            if(arr[i] == 0){
                for(int j = i + 1; j <= end; j++){
                    arr[j-1] = arr[j];
                }
                arr[end] = 0;
                end--;
            }else{
                i++;
            }
        }
    }
}

public class move_zeroes_to_end {
    public static void main(String[] args) {
        int[] arr = {0,2,46,0,1,2};
        executeTShi ets = new executeTShi();
        ets.outputt(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        

    }
}
