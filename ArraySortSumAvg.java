import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of participants n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;
        for (int x : arr) sum += x;
        double avg = (double) sum / n;

        System.out.println("The array after sorting: " + Arrays.toString(arr));
        System.out.println("Sum = " + sum + ", Avg = " + avg);

        sc.close();
    }
}
