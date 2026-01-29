package Arrays.Medium;

//Also called the dutch national flag problem
//got this by myself WOOOOO

class Solut {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;

        //Sorting zeroes
        while(j <= nums.length-1){
            
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        
        j = i;
        //Sorting ones
        while(j <= nums.length-1){
            
            if(nums[j] == 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}


public class sorting_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,2};

        Solut s = new Solut();
        s.sortColors(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
