package tutorial13;

import java.util.Scanner;

//배열 입력받고 최대 값 찾기

public class Main1 {
	
	public static int max(int a, int b)
	{
		return (a>b)?a:b;
	}

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기: ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i=0; i<number; i++)
		{
			System.out.print("배열에 입력할 정수 입력: ");
			array[i] = scanner.nextInt();
				
		}
		int result = -1;
		for(int i=0; i<number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println(result);
	}

}
