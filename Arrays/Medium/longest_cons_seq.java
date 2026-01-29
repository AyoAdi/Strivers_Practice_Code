package Arrays.Medium;
import java.util.Arrays;

class longestConsSeq{
    int solution(int[] arr){
        Arrays.sort(arr);
        if(arr.length == 0){
            return 0;
        }
        int count = -1;
        int temp = arr[0];
        int tempcount = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == temp){
                continue;
            }

            if(arr[i] == temp + 1){
                temp = arr[i];
                tempcount++;
                count = Math.max(count,tempcount);
            }else{
                tempcount = 1;
                temp = arr[i];
            }
        }
        return count;
    }
}

public class longest_cons_seq {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,12,13,14,15,16};
        longestConsSeq l = new longestConsSeq();
        System.out.print(l.solution(arr));

    }
}
