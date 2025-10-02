import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input age: ");
        int age = sc.nextInt();
        System.out.print("Input height (m): ");
        double height = sc.nextDouble();

        System.out.println("Hello " + name + ". Name: " + age + ", height: " + height + "m.");
        sc.close();
    }
}
