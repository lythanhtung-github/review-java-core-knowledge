import java.util.Scanner;

public class SumEvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");

        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= number; ++i) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.print("Sum: " + sum);
    }
}
