public class Pascaltriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            // System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
