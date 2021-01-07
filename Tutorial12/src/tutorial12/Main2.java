package tutorial12;

public class Main2 {
	//피보나치 수열 재귀함수로 만들기

	public static int fibonacci(int number) {
	if(number ==1)
	{
		return 1;
	}
	else if(number ==2)
	{
		return 1;
	}
	else
	{
		return fibonacci(number-1)+fibonacci(number-2);
	}
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(10));


	}

}
