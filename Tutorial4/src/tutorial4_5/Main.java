package tutorial4_5;

public class Main {

	//' 조건 ? 참 : 거짓 ' 연산의 형태
	public static void main(String[] args) {

		int x = 50;
		int y = 60;
		System.out.println("최댓값은 "+ max(x,y)+"입니다.");
		
	}
	//반환형, 함수이름, 매개변수
	static int max(int a, int b) {
		int result = (a>b) ? a:b;
		return result;
		
	}

}
