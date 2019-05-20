package com.algorithm.code_1_50.code_22;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * <p>
 * 例如，给出 n = 3，生成结果为：
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */

public class Solution {

    /**
     * 1.左括号用left表示剩余数量，右括号用right表示剩余数量。
     * 2.递归必须要有结束递归的条件，我们这个题目结束的条件就可以用剩余数量来决定
     * 3.结束递归有两种，
     *     A.一种是错了，如何结束？比如left > right,证明右括号用的多了，右括号用多了肯定会没办法最终组成。
     *     B.另一种是正确的，如何结束？比如left == 0 && right == 0 ,都用完了，既然满足上边的条件，那么肯定是正常结束，push_back即可。
     * 4.递归调用也分着调用。
     *     left左括号先递归，right右括号的后递归。
     * @param n
     * @return
     */

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs("",n,n,res);
        return res;
    }
    private void dfs(String str,int left,int right,List<String> res) {
        if(left > right) {
            return;
        }
        if(left == 0 && right == 0) {
            res.add(str);
        } else {
            if(left > 0) {
                dfs(str + "(",left-1,right,res);
            }
            if(right > 0) {
                dfs(str + ")",left,right-1,res);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }

}
