public class Calculator {
    private int no1, no2;

    Calculator(int num1, int num2) {
        no1 = num1;
        no2 = num2;
    }

    public int Addition() {
        return no1 + no2;
    }

    public int Subtraction() {
        return no1 - no2;
    }

    public int Multiply() {
        return no1 * no2;
    }

    public int Division() {
        return no2 == 0 ? 0 : no1 / no2;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator(10, 0);
        System.out.println(c1.Addition());
        System.out.println(c1.Subtraction());
        System.out.println(c1.Division());
        System.out.println(c1.Multiply());
    }
}
