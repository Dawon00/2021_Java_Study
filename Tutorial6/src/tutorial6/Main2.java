package tutorial6;

public class Main2 {

	public static void main(String[] args) {

		String a = "Man";//���ڿ�
		int b = 0;//������
		
		//�ڹٴ� String�� ���Ҷ� equal()�� �̿��մϴ�
		//�� ������ String�� �ٸ� �ڷ����� �ٸ� ���ڿ� �ڷ����̱� ����
		if(a.equals("Man"))
		{
			System.out.println("�����Դϴ�");
		}
		else
		{
			System.out.println("���ڰ� �ƴմϴ�");
		}
		if(b ==3)
		{
			System.out.println("b�� 3�Դϴ�");
		}
		else
		{
			System.out.println("3�� �ƴմϴ�");
		}
		if(a.equalsIgnoreCase("man")&&b==0)//��ҹ��� ����
		{
			System.out.println("��");
		}
		else
		{
			System.out.println("����");
		}
	}

}
