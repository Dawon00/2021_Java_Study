package tutorial10;

public class Main1 {
	//k번째 약수 찾기

	public static int function(int number, int k) {
		for(int i=1;i<=number; i++)
		{
			if(number % i ==0)
			{
				k--;
				if(k==0)
				{
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		int result = function(3050, 10);
		if(result == -1) {
			System.out.println("k번째 약수는 없습니다");
		}
		else
		{
			System.out.println(result);
		}
		
	}

}
