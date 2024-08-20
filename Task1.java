import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        long a = 0;
        long b = 1;
        long n;
        
        System.out.print(a + " " + b + " ");

        while (b < 10000000){

            n = a + b;
            a = b;
            b = n;
            if (n >= 10000000) break;
            System.out.print(n + " ");

        }
    }
}
