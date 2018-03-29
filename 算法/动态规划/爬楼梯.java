package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 爬楼梯（一次一阶或两阶）
	 */

	public static void print(Object obj) {
		System.out.println(String.format("%s", obj));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// String line = bf.readLine();
		String line;
		while ((line = bf.readLine()) != null) {
			print(f(Integer.valueOf(line)));
		}

	}

	private static int f(int n) {
		// TODO Auto-generated method stub
		int[] step = new int[3];
		step[0] = 1;
		step[1] = 1;
		for (int i = 2; i <= n; i++)
			step[i%3] = step[(i-1)%3] + step[(i-2)%3];
		return step[n%3];
	}
}
