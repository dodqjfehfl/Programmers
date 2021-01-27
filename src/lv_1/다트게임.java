package lv_1;

public class 다트게임 {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		System.out.println(solution(dartResult));
		dartResult = "1D2S#10S";
		System.out.println(solution(dartResult));
		dartResult = "1D2S0T";
		System.out.println(solution(dartResult));
		dartResult = "1S*2T*3S";
		System.out.println(solution(dartResult));
		dartResult = "1D#2S*3S";
		System.out.println(solution(dartResult));
		dartResult = "1T2D3D#";
		System.out.println(solution(dartResult));
		dartResult = "1D2S3T*";
		System.out.println(solution(dartResult));
	}

	public static int solution(String dartResult) {
		int answer = 0;

		int len = dartResult.length();
		int pre = 0;
		int now = 0;

		for (int i = 0; i < len; i = i + 2) { // 기본이 두글자 *,# 옵션
			// System.out.print(dartResult.charAt(i) + " " + dartResult.charAt(i + 1) + ",
			// ");
			now = dartResult.charAt(i) - '0';
			if (now == 1 && dartResult.charAt(i + 1) == '0') { // 10인지 확인
				now = 10;
				i++;
			}
			// System.out.println(now);

			// S 는 무시, D 제곱, T 세제곱
			if (dartResult.charAt(i + 1) == 'T') {
				now = (int) Math.pow(now, 3);
			} else if (dartResult.charAt(i + 1) == 'D') {
				now = (int) Math.pow(now, 2);
			}
			// System.out.println(now);

			// 옵션 확인
			if (i + 2 < len && dartResult.charAt(i + 2) == '*') {
				i++; // i 증가
				pre *= 2;
				now *= 2;

			} else if (i + 2 < len && dartResult.charAt(i + 2) == '#') {
				i++; // i 증가
				now = -now;
			}
			// System.out.println(pre + ", " + now);

			// 점수 더하기
			answer += pre;
			pre = now;
		}
		answer += now;

		return answer;
	}
}
