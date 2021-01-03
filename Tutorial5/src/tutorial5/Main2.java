package tutorial5;

public class Main2 {

	public static void main(String[] args) {

		String a = "I Love You.";
		if(a.contains("Love"))//String에서만 사용가능한 contains
		{
			//포함하는 경우 실행되는 부분
			System.out.println("Me Too.");
			
		}
		else
		{
			//포함하지 않는 경우 실행되는 부분
			System.out.println("I Hate You.");

		}
	}

}
