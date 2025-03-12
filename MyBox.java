public class MyBox {
    private int length, breadth, height;

    MyBox() {
        length = breadth = height = 0;
    }

    MyBox(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void display() {
        System.out.println("Volume of the box is: " + (length * breadth * height));
    }

    public static void main(String[] args) {
        MyBox m1 = new MyBox();
        m1.display();
        MyBox m2 = new MyBox(2, 2, 2);
        m2.display();
    }
}
