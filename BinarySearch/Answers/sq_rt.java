package BinarySearch.Answers;
//TC = O(logN)
class squareRoot{
    int getTheroot(int num){
        int closestVal = 0;
        int low = 1;
        int high = num;
        while(low <= high){
            long mid = low +(high-low)/2;
            //Sometimes, the vlaue of mid * mid might exceed the integer limit, so using long is safer
            if(mid * mid == num){
                closestVal = (int)mid;
                return (int)mid;
            } 

            if(mid * mid < num){
                closestVal = (int)Math.max(mid, closestVal);
                low = (int)mid+1;
            }else{
                //closestVal = Math.max(closestVal, mid);
                high = (int)mid-1;
            }
        }
        return closestVal;
    }
}


public class sq_rt {
    public static void main(String[] args) {
        int num = 169;
        squareRoot s = new squareRoot();
        System.out.print(s.getTheroot(num));
    }
}
