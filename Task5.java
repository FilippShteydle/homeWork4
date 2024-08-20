import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        int count = 0;
        boolean flag = false;

        while (a  > 0) {

            num.add(a % 10);
            a /= 10;
            count++;
        }

        for (int i = 0; i < count; i++) {

            if (num.get(i) == num.get((count - 1) - i)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        String rezult = flag ? "Yes" : "No";
        System.out.println(rezult);

    }
}
