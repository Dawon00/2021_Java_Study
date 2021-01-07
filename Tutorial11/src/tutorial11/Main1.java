package tutorial11;

public class Main1 {

	//반복함수로 팩토리얼 만들기
	public static int factorial(int number) {
		int sum = 1;
		for(int i= 2; i <= number; i++)
		{
			sum *= i;
		}
		return sum;
	}
	public static void main(String[] args) {

		System.out.println(factorial(10));
	}

}
