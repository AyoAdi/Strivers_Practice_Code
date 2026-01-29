package Java_Patterns;
import java.util.Scanner;


class pajamaExecute {
    int num;
    
    void pattern(int num){
        for(int i = 1; i <= num; i++){
            int maxNo = num * 2;
            //Number
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            //Space
            for(int j = 0; j < maxNo - 2 * i; j++){
                System.out.print(" ");
            }
            //Number Again
            for(int j = i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}

class rev_pajama{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the triangle: ");
        int n = sc.nextInt();

        pajamaExecute rt = new pajamaExecute();

        rt.pattern(n);
        sc.close();
    }   
}