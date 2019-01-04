package com.algorithm.swordOffice;

import java.util.ArrayList;

public class FindPath {
	private ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
    //private ArrayList<Integer> path = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
        if(root == null) return paths;
        path.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            paths.add(new ArrayList<Integer>(path));
        findPath(root.left, target);
        findPath(root.right, target);
        path.remove(path.size()-1);
        return paths;
    }
    int sum1 = 0;
    int sum2 = 0;
    private ArrayList<Integer> path = new ArrayList<Integer>();
    public int findPath(TreeNode root) {
        if(root == null) return 0;
        path.add(root.val);
        sum1 += root.val;
        if(root.left == null && root.right == null) {
        	if(sum2 > sum1 && sum2 != 0) {
        		sum2 = sum1;
        		sum1 = 0;
        	}
        	else if(sum2 == 0) {
        		sum2 = sum1;
        		sum1 = 0;
        	}
        }
        findPath(root.left);
        findPath(root.right);
        path.remove(path.size()-1);
        return 0;
    }
    public static void main(String[] args) {
		int a = 0;
		if(a == 0) {
			if(a > 1)
				System.out.println(a);
		}else
			System.out.println(a);
	}
}
