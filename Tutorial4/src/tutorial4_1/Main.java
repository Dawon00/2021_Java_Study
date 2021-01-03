package tutorial4_1;

public class Main {
	//초를 입력받아 몇 분 몇 초 인지 계산하는 프로그램
	
	final static int SECOND = 1000;

	public static void main(String[] args) {

		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분 " + second + "초");
	}

}
