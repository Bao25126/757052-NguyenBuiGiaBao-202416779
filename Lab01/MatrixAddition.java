package Lab01;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input rows: ");
        int rows = sc.nextInt();
        System.out.print("Input collums: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        System.out.println("Input matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Input matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println(" A + B = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
