import java.util.Scanner;

public class StudentCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            String studentCode;
            do {
                System.out.println("Enter student code " + i + ": ");
                studentCode = scanner.nextLine();
                if (!CheckCodeStudent.isStudentCode(studentCode)) {
                    --i;
                    System.out.println("Student code is valid!");
                }
                ++i;
            } while (!CheckCodeStudent.isStudentCode(studentCode));
        }
    }
}
