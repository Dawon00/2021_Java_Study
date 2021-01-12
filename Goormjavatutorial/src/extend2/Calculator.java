package extend2;

public class Calculator {

	int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

//곱하기 기능의 클래스 (기본 계산기 클래스를 상속받음)
class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}
