import java.util.Scanner;

public class Coordinates {
    private int x, y;

    public void accept() {
        System.out.println("Enter the values of x and y");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void display() {
        System.out.println("[" + x + "," + y + "]");
    }

    public static void main(String[] args) {
        Coordinates c1 = new Coordinates();
        c1.accept();
        c1.display();
    }
}
