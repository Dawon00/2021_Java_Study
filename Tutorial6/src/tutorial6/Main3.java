package tutorial6;

public class Main3 {

	//while이용해서 1부터 1000까지의 합 구하기
	
	public static void main(String[] args) {


		int i = 1, sum = 0;
		while(i<=1000) {
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은"+sum);
		
	}

}
