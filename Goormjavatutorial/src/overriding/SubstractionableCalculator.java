package overriding;

public class SubstractionableCalculator extends Calculator{
	 public void sum() {
	        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
	    }

	    public void substract() {
	        System.out.println(this.left - this.right);
	    }
}
