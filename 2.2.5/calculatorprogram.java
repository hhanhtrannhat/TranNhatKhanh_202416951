import javax.swing.JOptionPane;

public class calculatorprogram {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        String strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        String result = "Results:\n";
        result += "Sum: " + (num1 + num2) + "\n";
        result += "Difference: " + (num1 - num2) + "\n";
        result += "Product: " + (num1 * num2) + "\n";

        if (num2 != 0) {
            result += "Quotient: " + (num1 / num2);
        } else {
            result += "Quotient: Cannot divide by zero";
        }

        JOptionPane.showMessageDialog(null, result, "Calculator Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}