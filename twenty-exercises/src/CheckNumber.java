import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");

        int number;

        try {
            number = scanner.nextInt();

            if (number >= 0) {

                System.out.print(number + " is positive integer ");

            } else {

                System.out.print(number + " is negative integer ");

            }
        } catch (Exception e) {
            System.out.print("Number is valid");
        }
    }
}
