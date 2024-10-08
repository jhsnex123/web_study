//[ 실습 2 ] if 문 사용 실습
//1. ConditionOperLab 이라는 클래스를 생성한다.
//2. 1부터 5사이의 랜덤값을 추출한다.
//3. 추출된 값이 1이면 300 과 50 의 덧셈 연산을 처리한다.
//    추출된 값이 2이면 300 과 50 의 뺄셈 연산을 처리한다.
//    추출된 값이 3이면 300 과 50 의 곱셈 연산을 처리한다.
//    추출된 값이 4이면 300 과 50 의 나눗셈 연산을 처리한다.
//    추출된 값이 5이면 300 과 50 의 나머지 연산을 처리한다.
//4. 출력 형식(단, 결과를 출력하는 수행문장은 제일 아래에 한 번만 구현한다.)
//    "결과값 : XX"
public class ConditionOperLab {

	public static void main(String[] args) {
		int rand =(int)(Math.random()*5)+1;          // int형 rand값을 매스 랜덤(1~5)까지 값으로 초기화
		int sum=0; 									// int 형 sum값을 0으로 초기화
		if(rand == 1 ) { 							// if 값으로 rand == 1 로 조
			System.out.println((300+50)+sum);
		
		}else if(rand == 2 ) {
			System.out.println((300-50)+sum);
			
		}else if(rand == 3 ) {
			System.out.println((300*50)+sum);
			
		}else if(rand == 4 ) {
			System.out.println((300/50)+sum);
			
		}else if(rand == 5 ) {
			System.out.println((300%50)+sum);
			
		} else {
			System.out.println("결과값 : " + sum);		
}	
		
	}
}

