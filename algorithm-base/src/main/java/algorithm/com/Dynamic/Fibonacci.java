package algorithms.com.Dynamic;

/**
 * 쳲���������
 * @author sun
 *
 */
public class Fibonacci {
	
	
	public static int fibonacci(int n) {
		//int dp[] = new int[n+1];
		//dp[0] = 0;dp[1] = 1;
		//dp[2] = 2;
		if(n>=0 && n < 3) return n;
		int dp1 = 1;
		int dp2 = 2;
		int dp = 0;
		for(int i=3; i<=n; i++) {
			dp = dp1 + dp2;
			dp1 = dp2;
			dp2 = dp;
		}
			
		return dp;
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(3));
	}
	
}
