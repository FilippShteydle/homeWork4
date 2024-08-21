import java.util.ArrayList;
import java.util.Objects;

public class Task6 {

    public static void main(String[] args) {

        int a = 10000000;
        int n;
        ArrayList<Integer> num = new ArrayList<>();
        boolean rez = true;
        int count = 0;
        
        while (a <= 99999999) {
            n = a;

            if (a % 12345 == 0) {
                while (n > 0) {
                    num.add(n % 10);
                    n /= 10;
                }
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (i != j) {
                            if (!Objects.equals(num.get(i), num.get(j))) {
                                rez = true;
                            } else {
                                rez = false;
                                break;
                            }
                        }
                    }
                    if (!rez) break;
                }
                num = new ArrayList<>(0);
                if (rez) {
                    System.out.println(a);
                    count++;
                }
            }
            a++;
        }
        System.out.println("Всего чисел " + count);
    }
}
