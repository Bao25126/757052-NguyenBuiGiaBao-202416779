package Lab01;
import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a11, a12, b1:");
        double a11 = sc.nextDouble(), a12 = sc.nextDouble(), b1 = sc.nextDouble();
        System.out.println("Input a21, a22, b2:");
        double a21 = sc.nextDouble(), a22 = sc.nextDouble(), b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0)
                System.out.println("infinity solutions");
            else
                System.out.println("no solution");
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println(" x1 = " + x1 + ", x2 = " + x2);
        }
        sc.close();
    }
}
