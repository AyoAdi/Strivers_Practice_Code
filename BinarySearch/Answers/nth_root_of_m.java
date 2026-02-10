package BinarySearch.Answers;

class nthRootOfM{
    int getNthRoot(int n, int m){
        int low = 2;
        int high = m;
        while(low <= high){
            long mid = low + (high-low)/2;
            long ans = 1;
            for(int i = 0; i < n; i++){
                ans = ans * mid;
            }

            if(ans == m){
                return (int)mid;
            }

            if(ans < m){
                low = (int)mid + 1;
            }else{
                high = (int)mid-1;
            }
        }
        return -1;
    }
}



public class nth_root_of_m {
    public static void main(String[] args) {
        int n = 4;
        int m = 69;

        nthRootOfM nrm = new nthRootOfM();
        System.out.print(nrm.getNthRoot(n, m));
    }
}
