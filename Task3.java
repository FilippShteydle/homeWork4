import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {

        int a = 10;
        int n;
        int count = 0;
        int t;
        int rez = 0;
        ArrayList<Integer> num = new ArrayList<>();

        while (a <= 1000000) {
            n = a;
            while (n  > 0) {

                num.add(n % 10);
                n /= 10;
                count++;
            }

         for (int i = 0; i < count; i++) {
             t = (int) Math.pow(num.get(i), count);
             rez += t;
         }

         if (rez == a) System.out.println(a);
         a++;
         num = new ArrayList<>(0);
         count = 0;
         rez = 0;

        }
    }
}
