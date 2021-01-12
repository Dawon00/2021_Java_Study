package classinstance;

public class Main {

	public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        // 30 출력
        c1.sum();

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        // 60 출력
        c2.sum();

        // 클래스 변수 base의 값을 10으로 지정했다.
        Calculator2.base = 10;

        // 40 출력
        c1.sum();

        // 70 출력
        c2.sum();
        
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
        
        C1 c = new C1();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        //c.static_static();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> 실패
        //c.static_instance();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        //c.instance_static();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        //c.instance_instance();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        //C1.static_static();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        //C1.static_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_instance();
    }
    }
	

