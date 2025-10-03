package Lab01;
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Input num1: ");
        String strNum2 = JOptionPane.showInputDialog("Input num2: ");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "Sum = " + sum);
    }
}
