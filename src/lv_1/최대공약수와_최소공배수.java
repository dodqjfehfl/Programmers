package lv_1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 12)));
		System.out.println(Arrays.toString(solution(2, 5)));
	}

	static public int[] solution(int n, int m) {
		int nm = n * m;
		System.out.println(nm);
		if (n < m) {
			int temp = n;
			n = m;
			m = temp;
		}
		System.out.println(n + ", " + m);

		int mod = n % m;
		while (mod > 0) {
			n = m;
			m = mod;
			mod = n % m;
		}

		int[] answer = { m, nm / m };
		return answer;
	}
}
