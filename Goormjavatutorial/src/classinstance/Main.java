package classinstance;

public class Main {

	public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        // 30 ���
        c1.sum();

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        // 60 ���
        c2.sum();

        // Ŭ���� ���� base�� ���� 10���� �����ߴ�.
        Calculator2.base = 10;

        // 40 ���
        c1.sum();

        // 70 ���
        c2.sum();
        
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
	
}
