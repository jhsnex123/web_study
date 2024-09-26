package day5;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 6개의 정수 데이터를 저장할 배열을 생성하여 nums 배열 변수에 저장한다.
        int[] nums = new int[6]; 
		// 각각의 엘리먼트로 1~45 사이의 난수를 꺼내서 저장한다.
        	for(int i =0; i< nums.length; i++)
        		nums[i]= (int)(Math.random()*46);
		// 각각의 엘리먼트 값을 출력한다.
		// [ 방법 1 ]
        	for(int i =0; i< nums.length; i++)
        			System.out.printf("%d ", nums[i]);
        	System.out.println();
		// [ 방법 2 ]
        	for(int e : nums)
        		System.out.printf("%d ", e);
        	System.out.println();
		// nums 라는 배열 변수가 참조하는 배열에서  최대값을 추출하여 maxNum에 저장한다.
		int maxNum=0;
		for(int elem : nums)
			if(maxNum < elem)
				maxNum = elem;
		// nums 라는 배열 변수가 참조하는 배열에서  최대값을 추출하여 minNum에 저장한다.
		int minNum=46;
				for(int elem : nums)
					if(minNum > elem)
						minNum = elem;
		System.out.printf("\nnums라는 배열에서 제일 큰 값 : %d", maxNum);
		System.out.printf("\nnums라는 배열에서 제일 작은 값 : %d", minNum);
	}
}
