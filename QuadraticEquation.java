import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation");
            if (b != 0) System.out.println(" x = " + (-c / b));
            else System.out.println("No solution.");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("No solution");
            } else if (delta == 0) {
                System.out.println(" x = " + (-b / (2 * a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
        sc.close();
    }
}
