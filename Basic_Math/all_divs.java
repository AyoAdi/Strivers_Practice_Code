package Basic_Math;
import java.util.Scanner;
import java.util.ArrayList;

class outputHere{
    int n;
    void repeat(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                al.add(i);
            }
        }
        System.out.print(al);
    }
}

public class all_divs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        outputHere oh = new outputHere();
        oh.repeat(n);
        sc.close();
    }
}
