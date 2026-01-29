package Arrays.Easy;

class eXecute{
    boolean returnTs(int[] arr, int val){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return true;
            }
        }
        return false;
    }
}


public class linear_search{
    public static void main(String[] args) {
        int[] arr = {2,4,7,4,2,4,7,8,3};
        int val = 4;

        eXecute ex = new eXecute();
        System.out.print(ex.returnTs(arr, val));
    }
}