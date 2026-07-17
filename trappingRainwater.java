package arraysInJava;

public class trappingRainwater {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapped_Raianwater(height));
    }

    //rain water trapping program
    public static int trapped_Raianwater(int height[]){
        int n = height.length;

        //maximum height from left side
        int leftMax[] = new int[n];
        leftMax[0] = height[0];//4
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1] );
            System.out.print(leftMax[i]+" ");
        }
        System.out.println();
        //maximum of right side from height
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];//5
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
            System.out.print(rightMax[i]+" ");
        }
        System.out.println();
        int trap_water = 0;//loop in height array
        for(int i = 0; i < n ; i++){
            // finding water level 
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trap_water += waterLevel - height[i];               
        }
        return trap_water;

    }
}
