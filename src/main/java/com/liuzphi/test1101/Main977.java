package com.liuzphi.test1101;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Arrays;

/**
 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 示例 1： 输入：nums = [-4,-1,0,3,10] 输出：[0,1,9,16,100] 解释：平方后，数组变为 [16,1,0,9,100]，排序后，数组变为 [0,1,9,16,100]
 示例 2： 输入：nums = [-7,-3,2,3,11] 输出：[4,9,9,49,121]
 *
 */
public class Main977 {



    public static void main(String[] args) {
        int[] nums ={-4,-1,0,3,10};
        nums =  gty2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] gty(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }


    public static int[] gty2(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int[] res = new int[nums.length];
        int j = nums.length-1;
        while (l <= r){
            if (nums[r]*nums[r] > nums[l]*nums[l]){
                res[j--] = nums[r] * nums[r];
                r--;
            }else {
                res[j--] = nums[l] * nums[l];
                l++;
            }
        }

        return res;
    }

}