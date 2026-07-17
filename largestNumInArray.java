package arraysInJava;

public class largestNumInArray {
    public static void main(String[] args) {
        int arr[] = {7,4,6,3,2,1,8};
        System.out.println("largest element is found in array is : "+ largest_value(arr));
    }
    public static int largest_value(int n[])
    {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
           if(n[i] > largest){
            largest = n[i];
           }
        }
        return largest;
    }
}
