
public class Main {

	public static void main(String[] args) {
		
        //double
		double a = 10.3;
		double b = 9.6;
		double c = 10.1;
		
		System.out.println((a+b+c)/3);
		
		//�ݺ���
		for(char i='a';i<='z';i++)
		{
			System.out.print(i+ " ");
		}
		
		//10������ 8���� Ȥ�� 16������ �ٲپ� ���
		int A = 200;
		System.out.println("\n10���� : "+A);
		System.out.format("8���� :%o\n", A);
		System.out.format("16���� :%x", A);
		
		//String�� substring �Լ� Ȱ���غ���

		String name = "John Doe";
		System.out.println(name);
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(3, 6));
		System.out.println(name.substring(5, 8));

	}

}
