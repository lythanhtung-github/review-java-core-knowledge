import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your length: ");

        int length = scanner.nextInt();

        float[] numbers = new float[length];

        for (int i = 0; i < length; ++i) {
            do {
                System.out.println("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            } while (!isPositiveInteger(numbers[i]));

        }

        float sum = 0;
        float max = numbers[0];
        for (float number : numbers) {
            sum = sum + number;
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Average: " + sum / (numbers.length));
        System.out.println("Max: " + max);
    }

    public static boolean isPositiveInteger(float number) {
        if (number >= 0) return true;
        return false;
    }
}
