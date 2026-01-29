package Recursion;
import java.util.Scanner;

class outout{
    void output(int[] arr, int len){
        if(len < 0){
            return;
        }
        System.out.print(arr[len] + " ");
        output(arr, len-1);
    }
}

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int len = arr.length - 1;
        outout oo = new outout();
        oo.output(arr, len);
        sc.close();
    }
}
