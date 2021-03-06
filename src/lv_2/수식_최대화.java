package lv_2;

import java.util.*;

public class 수식_최대화 {
	public static void main(String[] args) {
		System.out.println(solution("100-200*300-500+20"));
		// 60420
		System.out.println(solution("50*6-3*2"));
		// 300
	}

	static char[] prior = { '+', '-', '*' };
	static boolean[] check = new boolean[3];
	static ArrayList<Long> nums = new ArrayList<Long>();
	static ArrayList<Character> ops = new ArrayList<Character>();
	static long answer;

	public static long solution(String expression) {
		answer = 0;

		String num = "";
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
				num += expression.charAt(i);
			} else {
				nums.add(Long.parseLong(num));
				num = "";
				ops.add(expression.charAt(i));
			}
		}
		nums.add(Long.parseLong(num));

		combi(0, new char[3]);
		return answer;
	}

	public static Long calc(Long num1, Long num2, char op) {
		long num = 0;
		switch (op) {
			case '+': {
				return num1 + num2;
			}
			case '-': {
				return num1 - num2;
			}
			case '*': {
				return num1 * num2;
			}
		}
		return num;
	}

	public static void combi(int count, char[] p) {
		if (count == 3) {
			// 원본 ArrayList 를 복사해준다.
			ArrayList<Long> cNums = new ArrayList<>(nums);
			ArrayList<Character> cOps = new ArrayList<Character>(ops);
			System.out.println(cNums.size() + " " + cOps.size());

			// 우선순위에 맞게 계산. list index 주의!
			// 숫자는 연산자 보다 항상 1개가 많다.
			for (int i = 0; i < p.length; i++) {
				for (int j = 0; j < cOps.size(); j++) {
					if (p[i] == cOps.get(j)) {
						// 리스트는 지울때 한칸씩밀리고 배열의 사이즈가 동적으로 변하므로
						// (j 를 두번 remove 하고 j-- 처리를 해준것이다.)
						Long res = calc(cNums.remove(j), cNums.remove(j), p[i]);
						cNums.add(j, res);
						cOps.remove(j);
						j--;
					}
				}
			}
			answer = Math.max(answer, Math.abs(cNums.get(0)));
			return;
		}

		// 모든 우선순위 조합구하기.
		for (int i = 0; i < 3; i++) {
			if (!check[i]) {
				check[i] = true;
				p[count] = prior[i];
				combi(count + 1, p);
				check[i] = false;
			}
		}

	}

}