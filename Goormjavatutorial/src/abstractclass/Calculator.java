package abstractclass;

class Calculator {
    static final double PI = 3.14;
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //final로 지정된 변수에는 한번 값이 할당되면 그 값을 바꿀 수 없기 때문에 오류가 발생한다.
        //Calculator.PI = 6;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}