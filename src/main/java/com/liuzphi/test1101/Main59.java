package com.liuzphi.test1101;

import java.util.Arrays;

/**
 给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 示例:
 输入: 3 输出: [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]
 *
 */
public class Main59 {



    public static void main(String[] args) {

        int[][] res =  gty(4);
        System.out.println(Arrays.deepToString(res));
    }

    public static int[][] gty(int n) {
        int loop = 0;
        int[][] nums = new int[n][n];
        int start = 0;
        int count = 1;
        int i,j;

        while (loop++ < n / 2) {

            for (i=start;i<n-loop;i++){
                nums[start][i] = count++;
            }

            for (j=start;j<n-loop;j++){
                nums[j][i] = count++;
            }

            for (;i >= loop;i--){
                nums[j][i] = count++;
            }

            for (;j>=loop;j--){
                nums[j][i] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            nums[start][start] = count;
        }



        return nums;
    }


}