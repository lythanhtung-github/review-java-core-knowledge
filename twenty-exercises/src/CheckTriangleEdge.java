import java.util.Scanner;

public class CheckTriangleEdge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float edge1;
        float edge2;
        float edge3;

        try {
            System.out.print("Enter edge1: ");
            edge1 = scanner.nextFloat();

            System.out.print("Enter edge2: ");
            edge2 = scanner.nextFloat();

            System.out.print("Enter edge3: ");
            edge3 = scanner.nextFloat();

            if ((edge1 + edge2 > edge3)
                    && (edge1 + edge3 > edge2)
                    && (edge2 + edge3 > edge1)
            ) {
                System.out.println("Is Triangle Edge");

                if (Math.pow(edge1, 2) + Math.pow(edge2, 2) == Math.pow(edge3, 2)
                        || Math.pow(edge1, 2) + Math.pow(edge3, 2) == Math.pow(edge2, 2)
                        || Math.pow(edge2, 2) + Math.pow(edge3, 2) == Math.pow(edge1, 2)
                ) System.out.println("Is Right Triangle Edge");
                return;
            }
            System.out.println("Not Triangle Edge");
        } catch (Exception e) {

            System.out.println("Edge is valid");
        }
    }
}
