//1. ArrayLab4 이라는 클래스를 하나 만든다.
//2. 5부터 10사이의 난수를 추출한다.
//3. 추출된 난수값을 크기로 갖는 int 타입의 배열을 생성한 후에 이 배열의 
   //각각의 원소값으로 1부터 26 사이의 난수를 추출하여 저장한다.
//4. 3에서 생성된 int 타입의 배열과 동일한 크기를 갖는 char 타입의 배열을 생성한다.
//5. int 타입의 배열에 저장된 각각의 원소값을 이용하여 char 타입의 배열에
    //알파벳 소문자를 원소값으로 저장하는데 1이면 'a', 2 이면 'b', ... 26이면 'z'를 저장한다.
//6. 두 배열의 원소값을 다음과 같이 출력한다.(출력값은 랜덤값이므로 다를 수 있다.)
    //[ 출력형식 ]

    //10,1,3,21,6,8,11,26,22,19
    //j,a,c,u,f,h,k,z,v,s


package day6;

public class ArrayLab4 {

	public static void main(String[] args) { // 자바의 운영체제?
		
		int rand = (int)(Math.random()*6)+5; //난수식 인트형으로 형변환(math)을 하고 랜덤으로 0~5숫자를 추출인데 여기서 +5를하면 5~10으로 추출됨 
		int[] ary = new int[rand];

		for(int i = 0 ; i<ary.length; i++) { // for문은(초기식, 조건식, 증감식이 온다) 이 문장은 향상된 for문으로 나타냈고 
		ary [i] = (int)(Math.random()*26+1); //
		
			
		char[] word = new char[rand];
		
		for(int n = 0; n < word.length; n++) {
			if(ary[n] >='a' && ary[n]<='z') {
				ary[n] = (char) (ary[n] - 32);
			}else {
				ary[n] = (char) (ary[n] + 32);
			}
			for(char c : word) {
				System.out.println(c);
			}
		}
	}

}
}