import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int number;
        do {

            System.out.print("Enter your number(0 -> 1000): ");
            number = new Scanner(System.in).nextInt();


        } while (number <= 0 || number > 1000);

        for (int i = 0; i <= number; ++i) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
