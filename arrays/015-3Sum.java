 import java.util.*;
 class arrays {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0; i < nums.length-2; i++ ){
            //skip duplicates
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j =i+1;
            int k = nums.length-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    out.add(Arrays.asList(nums[i],nums[j],nums[k]));

                    //skip duplicates for j
                    while(j<k && nums[j] == nums[j+1]){
                        j++;
                    }

                    //skip duplicates for k
                    while(j<k && nums[k] == nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return out;
    }
}
