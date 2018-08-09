package com.myhexin.com_36.InversePairs;

public class Solution {
	public int InversePairs(int[] array) {
		if(array == null || array.length == 0)
			return 0;
		int[] copy = new int[array.length];
		for(int i=0; i<copy.length; i++) {
			copy[i] = array[i];
		}
		int count = InversePairsCore(array,copy,0,array.length-1)%1000000007;

		return count;
	}

	private int InversePairsCore(int[] array, int[] copy, int start, int end) {
		if(start == end) {
			copy[start] = array[start];
			return 0;
		} 
		int length = (end-start)/2;
		
		//����
		int left = InversePairsCore(copy, array, start, start+length)%1000000007;
		int right = InversePairsCore(copy, array, start+length+1, end)%1000000007;
		
		int indexOfCopy = end;
		int i=start+length;  //ǰһ�����е����һ��
		int j= end;   //��һ�������е����һ��
		
		int count = 0;
		
		//System.out.println("legt: "+left);
		//System.out.println("right: "+right);
		
		while(i >= start && j>=start+length+1) {
			if(array[i] > array[j]) {
				copy[indexOfCopy--] = array[i--];
				count += j-start-length;
				if(count>1000000007)//��ֵ��������
                {
                    count%=1000000007;
                }
			}else {
				copy[indexOfCopy--] = array[j--];
			}
		}
		
		for(;i>=start; --i) {
			copy[indexOfCopy--] = array[i];
		}
		
		for(;j>=start+length+1; --j) {
			copy[indexOfCopy--] = array[j];
		}
		//System.out.println("count: "+count);
		return (count+left+right)%1000000007;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,0};
		int count = new Solution().InversePairs(array);
		System.out.println(count);
	}
	/**
	 * public int InversePairs(int [] array) {
        if(array==null||array.length==0)
        {
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            copy[i] = array[i];
        }
        int count = InversePairsCore(array,copy,0,array.length-1)%1000000007;//��ֵ��������
        return count;
         
    }
    private int InversePairsCore(int[] array,int[] copy,int low,int high)
    {
        if(low==high)
        {
            return 0;
        }
        int mid = (low+high)>>1;
        int leftCount = InversePairsCore(array,copy,low,mid)%1000000007;
        int rightCount = InversePairsCore(array,copy,mid+1,high)%1000000007;
        int count = 0;
        int i=mid;
        int j=high;
        int locCopy = high;
        while(i>=low&&j>mid)
        {
            if(array[i]>array[j])
            {
                count += j-mid;
                copy[locCopy--] = array[i--];
                if(count>1000000007)//��ֵ��������
                {
                    count%=1000000007;
                }
            }
            else
            {
                copy[locCopy--] = array[j--];
            }
        }
        for(;i>=low;i--)
        {
            copy[locCopy--]=array[i];
        }
        for(;j>mid;j--)
        {
            copy[locCopy--]=array[j];
        }
        for(int s=low;s<=high;s++)
        {
            array[s] = copy[s];
        }
        return (leftCount+rightCount+count)%1000000007;
    }
	 */
}
