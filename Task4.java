public class Task4 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 1000000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) System.out.println(i);
            sum = 0;
        }
    }
}
