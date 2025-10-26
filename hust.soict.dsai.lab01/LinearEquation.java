package Lab01;
import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("infinity solutions");
            } else {
                System.out.println("no solution");
            }
        } else {
            double x = -b / a;
            System.out.println(" x = " + x);
        }
        sc.close();
    }
}
