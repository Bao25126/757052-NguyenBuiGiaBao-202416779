package Lab01;
import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");
    }
}
