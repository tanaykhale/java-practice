public class MyNumber {
    private int number;

    MyNumber() {
        number = 0;
    }

    MyNumber(int number) {
        this.number = number;
    }

    public boolean isNegative(int n) {
        return n < 0;
    }

    public boolean isPositive(int n) {
        return n > 0;
    }

    public boolean isZero(int n) {
        return n == 0;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static void main(String[] args) {
        MyNumber m1 = new MyNumber();
        System.out.println(m1.isEven(4));
    }
}
