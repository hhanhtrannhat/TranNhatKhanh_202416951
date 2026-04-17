import javax.swing.JOptionPane;
public class seconddegreeequation {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Input a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Input b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Input c:"));

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, c == 0 ? "Infinitely many solutions" : "No solution");
            } else {
                JOptionPane.showMessageDialog(null, "x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Two distinct roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has a double root: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no real root.");
            }
        }
        System.exit(0);
    }
}

    
