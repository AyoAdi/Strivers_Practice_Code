package Arrays.Medium;
import java.util.Arrays;
class whatThe{
    int[][] executingThis(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] rows = new boolean[row];
        boolean[] columns = new boolean[col];

        //Getting indexes of places where the value is 0
        for(int i = 0; i < row; i++){
            for(int j = 0;j < col; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        //Setting the values to 0
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(rows[i] == true || columns[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}

public class set_zeroes_matrix {
    public static void main(String[] args) {
        int[][] input = {{1,1,1}, {1,0,1},{1,1,1}};
        whatThe s = new whatThe();
        System.out.print(Arrays.deepToString(s.executingThis(input)));
    }
}