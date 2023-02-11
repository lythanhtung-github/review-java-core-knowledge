import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCodeStudent {

    static final String CODE_STUDENT_REGEX = "^B\\d*$";

    public static boolean isStudentCode(String studentCode){
        Pattern pattern  = Pattern.compile(CODE_STUDENT_REGEX);
        Matcher match = pattern.matcher(studentCode);
        return (match.find() && match.group().equals(studentCode));
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your student code: ");

        String studentCode = scanner.nextLine();

        if(isStudentCode(studentCode)){
            System.out.print(studentCode + "is student code");
            return;
        }
        System.out.print(studentCode + "is not student code");

    }
}
