
package tutorial7;
import java.util.Scanner;


public class Main1 {
	//Scanner 클래스를 이용해서 프로그램 작성해보자
	//특정한 정수 입력받아서 출력해보기(기본 입출력)

	public static void main(String[] args) {

		//sc라는 변수
		Scanner sc =  new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 "+i);
		sc.close();
		
	}

}
