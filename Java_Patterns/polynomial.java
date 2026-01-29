package Java_Patterns;
import java.util.Scanner;


class toExecutee {
    int num;
    
    void pattern(int num){
        //Increasing Triangle
        for(int i = 0; i <= num; i++){
            //Space
            for(int j = 0; j < num - i - 1; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j = 0; j < (2*i) - 1; j++)
                System.out.print("*");
            
            //Space
            for(int j = 0; j < num - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        //Decreasing Triangle
        for(int k = num; k > 0; k--){
            //Space
            for(int j = 0; j < num - k - 1; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j = 0; j < (2*k) - 1; j++)
                System.out.print("*");
            
            //Space
            for(int j = 0; j < num - k - 1; j++){
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }
}

class polynomial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the triangle: ");
        int n = sc.nextInt();

        toExecutee rt = new toExecutee();

        rt.pattern(n);
        sc.close();
    }   
}