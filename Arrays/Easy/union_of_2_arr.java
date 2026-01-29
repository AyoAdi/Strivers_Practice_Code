package Arrays.Easy;
import java.util.*;

//Adding unique elements fromm both arrays into an array is the union of both

class toBeExecite{
    void executted(int[] a, int[] b){
        ArrayList<Integer> output = new ArrayList<>();

        //Checking if the number is there in output array or no from a
        for(int num : a){
            if(!output.contains(num)){
                output.add(num);
            }
        }

        //Checking if the number is there in output array or no from b
        for(int num : b){
            if(!output.contains(num)){
                output.add(num);
            }
        }

        Integer[] outputFinal = new Integer[output.size()];

        outputFinal = output.toArray(outputFinal);

        for(int num : outputFinal){
            System.out.print(num + " ");
        }
    }
}


public class union_of_2_arr {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,4,3};
        int[] arr2 = {5,3,6,8,4,3};
        toBeExecite te = new toBeExecite();
        te.executted(arr, arr2);

    }
}
