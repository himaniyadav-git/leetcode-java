package arraysInJava;

public class maxSubarraySum {
    
    public static void main(String[] args) {
        //use any one method to find subarray sum
        int numbers[] = {2,4,6,8,10};
        max_Subarray_Sum_1(numbers);

        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        max_Subarray_Sum_By_prefixArray( nums);
        kadanes_max_Subarray_sum( nums);

        int nos[] = {-2,-3,-1,-2,-3};
        negativeArray_max_Subarray_sum(nos);
    }

    //bruth force approach or simple approach --> approach1  time complexity = O(n^3)
    public static void max_Subarray_Sum_1(int n[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< n.length; i++){
            int start = i;

            for(int j = i; j < n.length; j++){
                int end = j;

                for(int k = start; k<=end; k++){
                   
                    currSum += n[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = "+ maxSum);
        //becoz of nested for loop its time complexity is O(n ^3) which is worst time complexity 
    }

    //approach 2 --> using prefix array  and time complexity = O(n^2)
    public static void max_Subarray_Sum_By_prefixArray(int n[]){
        int prefix[] = new int[n.length];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = n[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + n[i];
        }

        //find start
        for(int i = 0; i < n.length; i++){
            int start = i;
            for(int j = i; j < n.length; j++){
                int end = j;

                currSum = start == 0?prefix[start] : prefix[end]-prefix[start-1];//calculate sum 

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max subArray sum by prefix array is : " + maxSum);
    }

    //Approach 3 --> using kadanes algo --> time complexity = O(n)
    public static void kadanes_max_Subarray_sum(int n[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <n.length; i++){
            currSum = currSum + n[i];

            if(currSum < 0){//kadane says if sum is negative then take it as 0
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max subarray sum by kadanes is : " + maxSum);
    }

    //if all elements in an array are negative
    public static void negativeArray_max_Subarray_sum(int n[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <n.length; i++){
           if(n[i] < 0){
            currSum = currSum + n[i];
           }
           maxSum = Math.max(currSum , maxSum);
        }
        System.out.println("max subarray sum of negative array is : " + maxSum);
    }
}
