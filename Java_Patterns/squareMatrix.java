package Java_Patterns;
import java.util.Scanner;

class executee {
    int num;

    void pattern(int num){
        for(int i = 0; i <= num; i++){
            for(int j = 0; j <= num; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

class squareMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter size of square: ");
        int n = sc.nextInt();
        executee nt = new executee();

        nt.pattern(n);

        sc.close();
    }
}