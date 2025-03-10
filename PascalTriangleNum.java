public class PascalTriangleNum {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            // System.out.println();
            // for (int j = 0; j <= i; j++) {
            // System.out.print(j + 1);
            // }
            // for (int j = 1; j <= i; j++) {
            // System.out.print(j);
            // }
            for (int k = 2 * i + 1; k > 0; k--)
                System.out.print("*");
            System.out.println();

        }
    }
}
