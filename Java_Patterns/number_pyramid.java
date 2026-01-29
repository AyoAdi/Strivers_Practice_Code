package Java_Patterns;
import java.util.Scanner;

class executeed {
    int num;

    void pattern(int num){
        int numer = 1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(numer);
                numer++;
            }
            System.out.println(" ");
        }
    }
}

class number_pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        executeed nt = new executeed();

        nt.pattern(n);

        sc.close();
    }
}