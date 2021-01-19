package exception;

public class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		if(right == 0) {
			throw new IllegalArgumentException("두번째 인자값은 0이 될 수 없어요");
		}
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(this.right == 0) {
			throw new ArithmeticException("0으로 나누면 안돼요!");
		}
		try {
			System.out.print("계산결과:" + this.left/this.right);
		}catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStactTrace\n");
			e.printStackTrace();
		}
	}
}
