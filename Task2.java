public class Task2 {

    public static void main(String[] args) {

        boolean flag;

        for (long i = 2; i < 1000000; i++) {

            flag = true;

                for (long j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
            if (flag) System.out.print(i + " ");
        }
    }
}
