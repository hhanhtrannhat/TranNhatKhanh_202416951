package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingAccumulator extends JFrame {
    private JTextField oNhap;
    private JTextField oXuat;
    private int tong = 0;

    public SwingAccumulator() {
        Container vungChua = getContentPane();
        vungChua.setLayout(new GridLayout(2, 2));

        vungChua.add(new JLabel("Enter an Integer: "));

        oNhap = new JTextField(10);
        vungChua.add(oNhap);
        oNhap.addActionListener(new XuLyNhap());

        vungChua.add(new JLabel("The Accumulated Sum is: "));

        oXuat = new JTextField(10);
        oXuat.setEditable(false);
        vungChua.add(oXuat);

        setTitle("Swing Accumulator");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAccumulator();
    }

    private class XuLyNhap implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int soNhap = Integer.parseInt(oNhap.getText());
            tong += soNhap;
            oNhap.setText("");
            oXuat.setText(tong + "");
        }
    }
}