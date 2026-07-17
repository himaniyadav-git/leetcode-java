package arraysInJava;

public class NumberOfpairs {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printPairs(arr); //time complexity O(n)
        //finding pair such that for 2-->(2,4)(2,6)(2,8)(2,10)  for 4-->(4,6)(4,8)(4,10)  for 6-->(6,8)(6,10) for 8-->(8,10)
    }
    public static void printPairs(int a[]){
       int total_pairs = 0; // total pairs can be count manually by using formula --> n(n-1)/2
        for(int i = 0; i < a.length-1; i++)
        {
            for(int j = i +1; j < a.length; j++)
            {
                System.out.print("("+a[i] +" , "+ a[j]+")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs : " + total_pairs);
    }
}
