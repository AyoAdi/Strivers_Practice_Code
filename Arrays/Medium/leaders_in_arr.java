package Arrays.Medium;
import java.util.ArrayList;
import java.util.Arrays;

//This is inefficient, time complexity of O(N^2)
class leadersInArr{
    int[] output(int[] arr){
        if(arr.length == 0){
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length-1; i++){
            boolean leader = true;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] >= arr[j]){
                    continue;
                }else{
                    leader = false;
                    break;
                }
            }
            if(leader == true){
                al.add(arr[i]);
            }
            leader = true;
        }

        al.add(arr[arr.length-1]);
       int[] output = al.stream().mapToInt(i -> i).toArray();
       return output;
    }
}


public class leaders_in_arr {
    public static void main(String[] args) {
        //int[] arr = {16,17,4,3,5,2};
        int[] arr = {10,4,2,4,1};
        leadersInArr l = new leadersInArr();
        System.out.print(Arrays.toString(l.output(arr)));
    }
}
