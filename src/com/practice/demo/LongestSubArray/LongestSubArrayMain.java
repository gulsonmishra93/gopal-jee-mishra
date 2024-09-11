package com.practice.demo.LongestSubArray;

import java.util.HashSet;
import java.util.Set;

public class LongestSubArrayMain {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6, 7, 8, 9, 10};
        Set<Integer> set = new HashSet<>();
        for(Integer num : nums) {
            set.add(num);
        }

        int longestArray = 0 ;
        for (int i = 0;i<nums.length;i++) {

            if(!set.contains(nums[i]-1)) {
            int count =0;
            while(set.contains(nums[i]+count)) {
                count++;
                longestArray = Math.max(longestArray, count);
            }
            }
        }
System.out.println(longestArray);
    }
}
