package com.algorithm.code_51_100.code_59;

public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        if(n == 0) {
            return ans;
        }
        //定义四个方向，按照顺时针的顺序来进行定义
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0, c = 0, di = 0;
        //遍历所有的位置
        for (int i=0; i<n * n; i++) {
            ans[r][c] = i + 1;
            int rr = r + dr[di];
            int cc = c + dc[di];
            //如果符合条件，那就移动到下一个节点，否则，换方向
            if(rr >= 0 && rr < n && cc >=0 && cc < n && ans[rr][cc] == 0) {
                r = rr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        soutRes(new Solution().generateMatrix(3));
    }
    public static void soutRes(int[][] res) {
        if(res == null || res.length < 1) {
            System.out.println("错误了");
        }
        for(int i=0; i<res.length; i++) {
            for(int j=0; j<res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

}
