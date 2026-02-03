package BinarySearch.OneD;

//TF MAN
class optSingleEle{
    int getOutput(int[] arr){
        int n = arr.length;
        if(arr.length == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[n-1] != arr[n-2]){
            return arr[n-1];
        }

        int left = 1;
        int right = n-2;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            if(mid % 2 == 0){
                if(arr[mid] == arr[mid-1]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(arr[mid] == arr[mid+1]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}

public class opt_single_ele_in_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};

        optSingleEle ose = new optSingleEle();
        System.out.print(ose.getOutput(arr));
    }
}
