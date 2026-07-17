package arraysInJava;

import java.util.Scanner;

public class indexInrotatedArray {
    public static int pivot_elmment(int nums[])
    {   //finding pivot element which is the minimum element
        int pivot = -1;
        for(int i = 0; i < nums.length; i++)
        {
          if( nums[i]>nums[i+1])
          {
            pivot = nums[i+1];
            break;
          }
        }
        return pivot;
    }
    public static void rotate_Array(int arr[], int num){
        
        for(int i = 0; i < num; i++)
        {
            int start = arr[0];
            for(int j = 0; j < arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = start;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array :");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int rotateBy = sc.nextInt();

        rotate_Array(arr, rotateBy);
        System.out.println("Rotated array :");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("pivot or minimum element : "+pivot_elmment(arr));
    }
}
