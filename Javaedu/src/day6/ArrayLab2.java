//1. ArrayLab2 라는 클래스를 하나 만든다.
//2. 10개의 숫자(정수)를 저장할 수 있는 배열을 하나 만든다.
//3. 각각의 element로  4부터 20사이의 난수를 추출하여 저장한다.
//4. 모든 원소의 합을 구한다.
//5. 다음과 같은 형식으로 출력한다.

    //모든 원소의 값 : x,x,x,x,x,x,x,x,x,x
    //모든 원소의 합 : xxx




package day6;

public class ArrayLab2 {

	public static void main(String[] args) {
		
		int[] ary = new int[10];
			
		for(int i = 1; i <=ary.length ; i++) {
			ary[i] = (int)(Math.random() *17)+4;
			
			
			
	}
		
}
}