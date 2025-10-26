package Lab01;
import javax.swing.JOptionPane;

public class CalcTwoNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Input num1: ");
        String strNum2 = JOptionPane.showInputDialog("Input num2: ");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        String quotient = (num2 != 0) ? String.valueOf(num1 / num2) : "can not divide to 0";

        JOptionPane.showMessageDialog(null,
                "Sum = " + sum +
                "\nDiff = " + diff +
                "\nProduct = " + product +
                "\nTQuotient = " + quotient);
    }
}
