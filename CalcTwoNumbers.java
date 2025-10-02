import javax.swing.JOptionPane;

public class CalcTwoNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        String strNum2 = JOptionPane.showInputDialog("Nhập số thứ hai:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        String quotient = (num2 != 0) ? String.valueOf(num1 / num2) : "Không thể chia cho 0";

        JOptionPane.showMessageDialog(null,
                "Tổng = " + sum +
                "\nHiệu = " + diff +
                "\nTích = " + product +
                "\nThương = " + quotient);
    }
}
