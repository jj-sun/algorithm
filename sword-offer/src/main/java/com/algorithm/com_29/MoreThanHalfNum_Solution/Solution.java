package com.algorithm.com_29.MoreThanHalfNum_Solution;

import java.util.Arrays;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0) return 0;
        Arrays.sort(array);
        int mid = array[array.length/2];
        int count = 0;
        for(int i=0; i<array.length; i++) {
        	if(array[i] == mid)
        		count ++;
        }
        
        return count > (array.length/2) ? mid:0;
    }
}