package day15;

class Member1 {     //부모
	private int id;
	private String name;
	private String password;

	Member1(int id, String name, String password) {             //생성자 메서드 생성 (매개변수 int ,String,String)
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {             //toString() 애 오버라이딩 (재정의)
		return "Member1 [id=" + id + ", name=" + name + ", password=" + password + "]";
	}    
}

public class ObjectTest1 {
	public static void main(String args[]) {
		Member1 obj1 = new Member1(10, "자바", "duke");       
		Member1 obj2 = new Member1(10, "자바", "duke");

		System.out.println(obj1.equals(obj2));	//                     f             equals 오버라이딩(재정의)를 안해서 오브젝트(조상)을 불러서 기능사용
		System.out.println(obj1 == obj2);			//                f 			

		Member1 obj3 = obj2;                      
		System.out.println(obj3.equals(obj2));  	//       t
		System.out.println(obj3 == obj2);        	//      t
	}
}
