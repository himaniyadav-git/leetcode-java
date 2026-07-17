package arraysInJava;

import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        // checks for value that appears atleast twice in array if contains return true else return false

        int nums[] = {1,2,3,1};
        System.out.println(contains_Duplicate(nums));
    }
    public static boolean contains_Duplicate(int nums[]){

        //bruth force approach --> time complexity= O(n^2)

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]== nums[j]){
                    return true;
                }
            }
        }  
        return false;  
    }
    //2nd approach using hashset ----> time complexity = O(n)
    public static boolean contains_Duplicate_1(int nums[]){
        HashSet<Integer> set = new HashSet<>();  //hashset is a collection of unique values and it is found in java.util package
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
