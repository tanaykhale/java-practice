public class CountPrime {
    static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 99; i++) {

            if (isPrime(i))
                count++;

        }
        System.out.println(count);
    }
}
