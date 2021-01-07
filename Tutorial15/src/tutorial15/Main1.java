package tutorial15;

public class Main1 {

	public static void main(String[] args) {

		Node1 one = new Node1(10,20);
		Node1 two = new Node1(30,40);
		Node1 result = one.getCenter(two);
		System.out.println(result.getX()+ " "+result.getY());

		
	}

}
