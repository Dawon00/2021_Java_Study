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
        
        C1 c = new C1();
        // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 ���� ������ ���� -> ����
        //c.static_static();
        // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
        // ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        //c.static_instance();
        // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 Ŭ���� ������ ���� -> ����
        //c.instance_static();
        // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        //c.instance_instance();
        // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
        // Ŭ���� �޼ҵ尡 Ŭ���� ������ ���� -> ����
        //C1.static_static();
        // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
        // Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        //C1.static_instance();
        // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        //C1.instance_static();
        // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        //C1.instance_instance();
    }
    }
	

