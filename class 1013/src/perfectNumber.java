
public class perfectNumber {

	public static void main(String[] args) {
		// 2부터 1000까지 완전수의 개수 구하기
		// 완전수: 자기 자신을 제외한약수의 합이 자기 자신과 동일한 수
		// 완전수 개수를 저장할 변수

		int cnt = 0; // 2부터1000까지
		for (int su = 2; su <= 1000; su = su + 1) {
			// 약수의 합을 저장하기위한 변수
			int sum = 1;
			for (int i = 2; i <= su / 2; i = i + 1) {
				if (su % i == 0) {
					// 약수이므로 sum에 추가
				}
				sum = sum + i;

			}
			if (su == sum) {
				cnt = cnt + 1;
				System.out.printf("완전수: %d\n", su);

			}
		}
               System.out.printf("완전수 개수: %d\n", cnt);
	}
}
