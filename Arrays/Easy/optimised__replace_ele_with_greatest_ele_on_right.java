package Arrays.Easy;
import java.util.Arrays;

class optReplace{
    int[] executed(int[] arr){
        if(arr.length == 1){
            arr[arr.length-1] = -1;
            return arr;
        }

        int max = arr.length-1;
        arr[arr.length-1] = -1;

        for(int i = arr.length-2; i >= 0; i--){
            int temp = Math.max(max, arr[i]);
            arr[i] = max;
            max = temp;
        }

        return arr;
    }
}

public class optimised__replace_ele_with_greatest_ele_on_right {
    public static void main(String[] args) {
        int[] arr = {17,18,5,6,4,1,1};
        optReplace or = new optReplace();
        System.out.print(Arrays.toString(or.executed(arr)));
    }
}
