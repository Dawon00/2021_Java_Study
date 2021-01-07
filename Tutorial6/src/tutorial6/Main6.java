package tutorial6;

public class Main6 {

	//조건문 반복문
	public static void main(String[] args) {
		
		int count = 0;
		for(;;)//무한루프
		{
			System.out.println("출력");
			count++;
			if(count == 10)//10이 되면 빠져나옴
			{
				break;
			}
		}
	}

}
