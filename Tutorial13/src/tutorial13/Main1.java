package tutorial13;

import java.util.Scanner;

//�迭 �Է¹ް� �ִ� �� ã��

public class Main1 {
	
	public static int max(int a, int b)
	{
		return (a>b)?a:b;
	}

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �迭�� ũ��: ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i=0; i<number; i++)
		{
			System.out.print("�迭�� �Է��� ���� �Է�: ");
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
