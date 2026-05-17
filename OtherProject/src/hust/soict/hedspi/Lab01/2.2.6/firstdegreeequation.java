import javax.swing.JOptionPane;
public class firstdegreeequation {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Input a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Input b:"));
        
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        }
        System.exit(0);
    }
}
