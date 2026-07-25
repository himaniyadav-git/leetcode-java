package arrays;

import java.util.*;

class arrays{

    public int[] twoSum(int[] nums, int target) {
        int sum[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int remain = target - nums[i];

            if(hm.containsKey(remain)){
                sum[0] = hm.get(remain);
                sum[1] = i;
            }
            hm.put(nums[i], i);
        }
        return sum;
    }
}