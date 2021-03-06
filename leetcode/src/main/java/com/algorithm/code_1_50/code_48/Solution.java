package com.algorithm.code_1_50.code_48;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像。
 *
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 *
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 * 示例 1:
 *
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 * 示例 2:
 *
 * 给定 matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 */

public class Solution {

    /**
     * 解释下就是每个i表示一个圈，不论len是奇是偶都是一共有len/2个圈要进行旋转，从外圈向内依次旋转，直到中心点或者最内圈
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i = 0; i < len/2; i++) {
            int start = i;
            int end = len - i - 1;
            for(int j = 0; j < end -start; j++) {
                int temp = matrix[start][start+j];
                matrix[start][start+j] = matrix[end-j][start];
                matrix[end-j][start] = matrix[end][end-j];
                matrix[end][end-j] = matrix[start + j][end];
                matrix[start+j][end] = temp;
            }
        }


    }

}
