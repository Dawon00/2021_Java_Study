package tutorial15;


public class Node1 {
	//��ġ, ��ǥ�� ��Ÿ��

	
	private int x;
	private int y;
	
	//��������
	public int getX() {
		return x;
	}
	//�����ϱ�
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	//������
	public Node1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Node1 getCenter(Node1 other) {
		return new Node1((this.x + other.getX())/2,(this.y+other.getY())/2);
	}
}
