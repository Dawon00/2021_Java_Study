package inheritanceExample;

public class CalculatorConstructorDemo {

	public static void main(String[] args) {

		SubstractionableCalculator c1 = new SubstractionableCalculator(10,20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
