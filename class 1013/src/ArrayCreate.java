
public class ArrayCreate {

	public static void main(String[] args) {
		// 이름 배열을 생성과 동시에 초기화
		String[] names = { "이명박", "박근혜", "트럼프", "장석헌", "윤동민", "박도현","박주홍" };
		// 정수 3개를 저장할 수 있는 배열을 만들고 값을 대입.
		int[] scores = new int[7];
		scores[0] = 99;
		scores[1] = 30;
		scores[2] = 55;
		scores[3] = 40;
		scores[4] = 70;
		scores[5] = 80;
		scores[6] = 50;


//		System.out.printf("이름은 %s이고 점수는 %d 입니다. \n", names[0], scores[0]);
//		System.out.printf("이름은 %s이고 점수는 %d 입니다. \n", names[1], scores[1]);
//		System.out.printf("이름은 %s이고 점수는 %d 입니다. \n", names[2], scores[2]);
//		System.out.printf("이름은 %s이고 점수는 %d 입니다. \n", names[3], scores[3]);
//		System.out.printf("이름은 %s이고 점수는 %d 입니다. \n", names[4], scores[4]);
//		System.out.printf("이름은 %s이고 점수는 %d 입니다. \n", names[5], scores[5]);
		// 반복문을 사용하면 유지보수가 수 해짐



		
		// 3이라고 배열의 데이터 개수를 설정하는 부분을 수정
		//배열의 속성으로 설정 데이터가 변경이 되도 출력하는 부분을 수정할 필요가 없어집니다.
	    /*int len = names.length;
		for(int i= 0; i<names.length; i=i+1) {
		   System.out.printf("이름은 %s이고 점수는 %d 입니다 \n"
				   ,names[i], scores[i]);
	
	}
	*/
	   // . 으로 접근하거나 [인덱스]로 데이터를 접근하게되면 메모리를 한 번 더 찾아가야합니다.
	   //반복문 등에서 동일한 데이터를 여러번 . 이나 [인덱스]를 
	   //이용해서 찾아가게 되면 비효율적
	   //이런 경우네는이 데이터를 가까 곳에 저장해두고 접근하는것이 좋습니다.
	  
		//빠른 열거를 이용한 names의 데이터 출력
		
		for(String name:names){
	           System.out.printf("%s\n", name);
		}
	   
	}
}
	
