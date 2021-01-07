package tutorial11;

public class Main2 {

	//재귀함수로 팩토리얼 만들기
	public static int factorial(int number) {
		if(number ==1)
			return 1;
		else
			return number *factorial(number-1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(10));

	}

}
