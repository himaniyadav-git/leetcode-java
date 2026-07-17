package arraysInJava;

import java.util.Scanner;

public class rotateArray {
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
    }
}
