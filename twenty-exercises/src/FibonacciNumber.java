import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        int number;
        do {

            System.out.print("Enter your number(0 -> 20): ");
            number = new Scanner(System.in).nextInt();

        } while (number <= 0 || number > 20);

        System.out.println(getFibonacciByIndex(number));
    }

    public static int getFibonacciByIndex(int index) {
        int f0, f1 = 1;
        int fn = 2;

        if (index == 0 || index == 1) {
            return 1;
        }

        for (int i = 2; i <= index; ++i) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }

        return fn;
    }
}
