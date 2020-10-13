
public class Matrix {

	public static void main(String[] args) {
		// 문자열 2차원 배열을 생성
		String[][] names = { { "동민", "주홍", "석헌" }, { "도현", "성현", "민수" } };
		// 행의 순회
		/*
		 * for (int i = 0; i < names.length; i = i + 1) {
		 * 
		 * for (int j = 0; j < names[i].length; j = j + 1) { System.out.printf("%s\n",
		 * names[i][j]);
		 * 
		 * } System.out.printf("\n"); }
		 */

		// 빠른 열거 이용
		// 배열의 배열이므로 처음에는 배열에 저장하고
		/*
		 * for (String[] temp : names) { for (String imsi : temp){
		 * 
		 * System.out.printf("%15s",imsi); } System.out.printf("\n");
		 * 
		 * }
		 */

		// 일차원 배열을 이차원 배열 처럼 이용
		// 이 구조는 실무에서도 많이 이용
		String[] players = { "트럼프", "부시", "오바마", "시진핑", "김정은", "박근혜" };
		for (int i = 0; i < players.length; i = i + 1) {
			System.out.printf("%15s", players[i]);
			if (i % 3 == 2) {
				System.out.printf("\n");
			}
		}

	}
}
