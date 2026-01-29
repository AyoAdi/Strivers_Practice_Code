package Arrays.Easy;
import java.util.Arrays;

//This is my approach, its O(n^2)
class replaceEle{
    int[] returnArr(int[] arr){
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }

        for(int i = 0; i < arr.length-1; i++){
            int max_val = Integer.MIN_VALUE;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > max_val){
                    max_val = arr[j];
                }
            }
            arr[i] = max_val;
            max_val = Integer.MIN_VALUE;
        }

        arr[arr.length-1] = -1;
        return arr;
    }
}

public class naive_replace_ele_with_greatest_ele_on_right {
    public static void main(String[] args) {
        int[] arr = {17,18,5,6,4,1,1};
        replaceEle re = new replaceEle();
        System.out.print(Arrays.toString(re.returnArr(arr)));
    }
}
