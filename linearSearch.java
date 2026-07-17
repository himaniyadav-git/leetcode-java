package arraysInJava;

public class linearSearch {
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int key = 4;

        int index = linear_Search(nums,key);
        if(index == -1){
            System.out.println("key not found..");
        }else{
            System.out.println("key : "+key+ " found at : "+index);
        }
        
    }
    public static int linear_Search(int [] nums, int key){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                return i;
            }
            
        }
        return -1;
        
    }
}
