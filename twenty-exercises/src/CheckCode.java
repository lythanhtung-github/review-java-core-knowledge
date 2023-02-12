import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCode {

    static final String CODE_REGEX = "^00([2-5])L\\d*$";

    public static boolean isCode(String code) {
        Pattern pattern = Pattern.compile(CODE_REGEX);
        Matcher match = pattern.matcher(code);
        return (match.find() && match.group().equals(code));
    }

    public static void main(String[] args) {

        String[] codes = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; ++i) {
            System.out.print("Enter code " + (i + 1) + ": ");
            String code = scanner.nextLine();
            codes[i] = code;
        }

        System.out.println(Arrays.toString(codes));

        int count = 0;
        for (String item : codes) {
            if (!isCode(item)) {
                System.out.print("Wrong!");
                break;
            }
            ++count;
        }

        if (count == 5) System.out.print("Correct!");

    }
}
