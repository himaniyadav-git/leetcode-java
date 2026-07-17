package arraysInJava;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {7,4,6,3,2,1,8};

        System.out.println("original array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        System.out.println("reverse array");
        reverse_array(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        
    }
    public static void reverse_array(int n[])
    {
        int start = 0;
        int end = n.length-1;
        while(start < end){
            //swaping
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;

            start++;
            end--;
        }
        
    }
}
