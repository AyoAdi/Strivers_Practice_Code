package Arrays.Medium;

/* 
We are goign through the array, and updating the minimum as we go. 
For instance, let array be {2,4,1}
We first compare the first value with min value, update it. Then, we move to the next value
We check the diference this time, since its bigger than minValue, udpate profit. 
In my previous approach, i took the global min instead of going with the array. Will keep
this in mind 
*/


class Output{
    int returnOutput(int[] prices){
        int profit = 0;
        int minValue = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < minValue){
                minValue = price;
            }else{
                profit = Math.max(profit, price - minValue);
            }
        }
        return profit;
    }
}

public class best_time_to_buy_sell_stock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        Output o = new Output();
        System.out.print(o.returnOutput(arr));
    }
}
