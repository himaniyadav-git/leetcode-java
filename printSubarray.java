package arraysInJava;

public class printSubarray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        print_Subarray(arr); //time complexity O(n)
    }
    public static void print_Subarray(int a[]){
        int sum = 0;
        for(int i = 0; i < a.length ; i++)
        {
            int start = i;
            System.out.println("subarray of : "+a[i]);
            for(int j = i ; j < a.length ; j++)
            {
                int end = j;
                
                for(int k = start; k <= end; k++)
                {
                    System.out.print(a[k]+" ");
                    sum += a[k];
                    
                }
                System.out.println( "    sum : "+sum);
                
            }
            System.out.println(sum);
            System.out.println();
        }
    }
}
