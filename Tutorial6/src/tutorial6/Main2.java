package tutorial6;

public class Main2 {

	public static void main(String[] args) {

		String a = "Man";//문자열
		int b = 0;//정수형
		
		//자바는 String을 비교할때 equal()을 이용합니다
		//그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문
		if(a.equals("Man"))
		{
			System.out.println("남자입니다");
		}
		else
		{
			System.out.println("남자가 아닙니다");
		}
		if(b ==3)
		{
			System.out.println("b는 3입니다");
		}
		else
		{
			System.out.println("3이 아닙니다");
		}
		if(a.equalsIgnoreCase("man")&&b==0)//대소문자 무시
		{
			System.out.println("참");
		}
		else
		{
			System.out.println("거짓");
		}
	}

}
