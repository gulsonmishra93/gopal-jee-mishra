package com.practice.demo.TargetSum;

public class DifferenceOfSubsetsMain {
    public static void main(String[] args) {
        int[] nums= {1,1,1,1,1};
        //int[] nums = {1,2,3,1};
        int target = 3;
        System.out.println(targetSum(nums,0,0,target));

    }
    public static int targetSum(int[] nums,int pos,int sum,int target) {
        if(nums.length == pos){
            return sum == target ? 1 : 0;
        }
        return targetSum(nums,pos+1,sum+ -nums[pos],target)
                + targetSum(nums,pos+1,sum+nums[pos],target);

    }
}
