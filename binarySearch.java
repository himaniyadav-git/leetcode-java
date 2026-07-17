package arraysInJava;

public class binarySearch {
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int key = 4;

        int index = binary_Search(nums,key);
        if(index == -1){
            System.out.println("key not found..");
        }else{
            System.out.println("key : "+key+ " found at : "+index);
        }
        
    }
    public static int binary_Search(int []nums, int key){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid] == key){
                return mid;
            }
            else if(nums[mid] > key){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }

        }
        return -1;
    }
}
