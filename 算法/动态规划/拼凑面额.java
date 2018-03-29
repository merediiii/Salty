package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  coins = { 1, 5, 10, 20, 50, 100 }
	 *  组成钱数
	 */
	
	public static int[] coins = { 1, 5, 10, 20, 50, 100 };

	public static void print(Object obj) {
		System.out.println(String.format("%s", obj));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// String line = bf.readLine();
		String line;
		while ((line = bf.readLine()) != null) {
			print(f(coins, Integer.valueOf(line)));
		}

	}

	private static long f(int[] coins, int n) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		long[] dp = new long[n+1];
		dp[0] = 1;
		for(int i = 0 ; i<coins.length ; i++)
			for(int j = 1; j <= n ; j ++)
				if(j - coins[i] >= 0 )
					dp[j] += dp[j - coins[i]];
		return dp[n];
	}
}
