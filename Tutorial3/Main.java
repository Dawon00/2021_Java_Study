
public class Main {

	public static void main(String[] args) {
		
        //double
		double a = 10.3;
		double b = 9.6;
		double c = 10.1;
		
		System.out.println((a+b+c)/3);
		
		//반복문
		for(char i='a';i<='z';i++)
		{
			System.out.print(i+ " ");
		}
		
		//10진수를 8진수 혹은 16진수로 바꾸어 출력
		int A = 200;
		System.out.println("\n10진수 : "+A);
		System.out.format("8진수 :%o\n", A);
		System.out.format("16진수 :%x", A);
		
		//String의 substring 함수 활용해보기

		String name = "John Doe";
		System.out.println(name);
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(3, 6));
		System.out.println(name.substring(5, 8));

	}

}
