package BinarySearch.Answers;

//Also solution for split array max sum problem, thank you striver
class bookAllocation{
    int getOutput(int[] books, int m){
        int maxVal = Integer.MIN_VALUE;
        int sum = 0;
        int out = -1;

        for(int i = 0; i < books.length; i++){
            if(books[i] > maxVal){
                maxVal = books[i];
            }

            sum += books[i];
        }

        while(maxVal <= sum){
            int mid = maxVal + (sum - maxVal)/2;

            if(isTrue(books, m, mid)){
                out = mid;
                sum = mid-1;
            }else{
                maxVal = mid+1;
            }            
        }
        return out;
    }


    boolean isTrue(int[] books, int m, int mid){
        int count = 1;
        int pageSum = 0;

        for(int i = 0; i < books.length; i++){
            if(pageSum + books[i] > mid){
                count++;
                pageSum = books[i];
            }else{
                pageSum += books[i];
            }
        }
        return ( count <= m);
    }
}


public class book_allocation {
    public static void main(String[] args) {
        int[] books = {12,34,67,90};
        int m = 2;


        bookAllocation b = new bookAllocation();
        System.out.print(b.getOutput(books, m));
    }
}
