package Basic_Math;
import java.util.Scanner;

class freqEle{
    int output(int[] arr, int n){
        int[] store = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            store[arr[i]] += 1;
        }
        return store[n];
    }
}

public class freq_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,3,3,2,4, 4,4,4,4,4};
        System.out.print("Enter the number you want to check occur of: ");
        int no = sc.nextInt();
        freqEle fe = new freqEle();
        System.out.print(fe.output(arr, no));
        sc.close();
    }
}
