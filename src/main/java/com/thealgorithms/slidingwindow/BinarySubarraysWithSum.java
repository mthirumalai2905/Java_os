package com.thealgorithms.slidingwindow;

import java.util.HashMap;

public class BinarySubarraysWithSum {
    class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int res = 0;
            int ps = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            for(int i : nums){
                ps += i;
                res += map.getOrDefault(ps - goal, 0);
                map.put(ps, map.getOrDefault(ps,0) + 1);
            }
           return res;
        }
    }
}
