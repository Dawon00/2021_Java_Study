package tutorial15;


public class Node1 {
	//위치, 좌표를 나타냄

	
	private int x;
	private int y;
	
	//가져오기
	public int getX() {
		return x;
	}
	//설정하기
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	//생성자
	public Node1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Node1 getCenter(Node1 other) {
		return new Node1((this.x + other.getX())/2,(this.y+other.getY())/2);
	}
}
