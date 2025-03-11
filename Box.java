public class Box {
    private int height, width, depth;

    Box(int h, int w, int d) {
        height = h;
        width = w;
        depth = d;
    }

    public int volume() {
        return height * width * depth;
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 10, 10);
        System.out.println(b1.volume());
    }
}
