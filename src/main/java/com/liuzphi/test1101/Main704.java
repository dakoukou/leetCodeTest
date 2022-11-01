package com.liuzphi.test1101;

import java.util.List;

/**
 * 二分查找
 *
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 链接：<a href="https://leetcode.cn/problems/binary-search">...</a>
 *
 */
public class Main704 {


    /**
     * 示例 1:
     *
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     * 示例2:
     *
     * 输入: nums = [-1,0,3,5,9,12], target = 2
     * 输出: -1
     * 解释: 2 不存在 nums 中因此返回 -1
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums ={-1,0,3,5,9,12};
        int result =  gty2(nums,9);
        int result2 =  gty(nums,2);

        System.out.println(result);
        System.out.println(result2);

    }

    public static int gty(int[] nums, int target) {

        int left = 0;
        int right = nums.length ;
        while (left < right){
            int middle = left + ((right - left) >> 1);
            if (nums[middle] > target) {
                right = middle;
            }else if (nums[middle] < target){
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int gty2(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            int middle = left + ((right - left) >> 1);
            if (nums[middle] > target) {
                right = middle -1;
            }else if (nums[middle] < target){
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }



}