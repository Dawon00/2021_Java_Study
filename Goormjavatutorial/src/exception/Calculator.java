package exception;

public class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		if(right == 0) {
			throw new IllegalArgumentException("�ι�° ���ڰ��� 0�� �� �� �����");
		}
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(this.right == 0) {
			throw new ArithmeticException("0���� ������ �ȵſ�!");
		}
		try {
			System.out.print("�����:" + this.left/this.right);
		}catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStactTrace\n");
			e.printStackTrace();
		}
	}
}
