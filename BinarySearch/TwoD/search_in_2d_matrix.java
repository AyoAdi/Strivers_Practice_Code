package BinarySearch.TwoD;
//TC = (m + logN) I think
class searchInTwoDMatrix{
    boolean getOutput(int[][] matrix, int target){
        boolean output =false;
        int x = matrix.length; //Row
        int y = matrix[0].length; //Column

        //getting the row where the target might lie
        int targetRow = 0;

        for(int i = 0; i < x; i++){
            if(target <= matrix[i][y-1]){
                targetRow = i;
                break;
            }
        }

        //Checking the row
        
        int i = 0;
        int j = y-1;

        while(i <= j){
            int mid = i + (j-i)/2;
            if(matrix[targetRow][mid] == target){
                return true;
            }
            if(matrix[targetRow][mid] > target){
                j = mid-1;

            }else{
                i = mid+1;
            }
        }
        return output;
        
    }
}


public class search_in_2d_matrix {
    public static void main(String[] args) {
        //int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 1;
        int[][] matrix = {{1}};

        searchInTwoDMatrix st = new searchInTwoDMatrix();
        System.out.print(st.getOutput(matrix, target));
    }
}
