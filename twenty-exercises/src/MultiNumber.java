import java.util.Scanner;

public class MultiNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= 20; ++i) {
            System.out.println(i * number);
        }
    }
}
