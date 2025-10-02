import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your name:");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");
    }
}
