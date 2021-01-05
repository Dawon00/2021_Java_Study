package tutorial6;

public class Main4 {
	//for문을 이용하여 삼각형을 출력하는 프로그램

	final static int N = 30;
	public static void main(String[] args) {
		//for문: 초기화부분, 조건부분, 연산부분
		for(int i=N;i>0;i--) 
		{
			for(int j=i; j>0;j--) 
			{
				System.out.print("*");

			}
			System.out.println();
		}

		
	}

}
