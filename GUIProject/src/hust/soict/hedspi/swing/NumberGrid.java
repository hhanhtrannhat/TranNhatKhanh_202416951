package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberGrid extends JFrame {
    private JButton[] mangNutSo = new JButton[10];
    private JButton nutXoa, nutDatLai;
    private JTextField oHienThi;

    public NumberGrid() {
        oHienThi = new JTextField();
        oHienThi.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel vungChuaNut = new JPanel(new GridLayout(4, 3));
        themCacNut(vungChuaNut);

        Container vungChuaChinh = getContentPane();
        vungChuaChinh.setLayout(new BorderLayout());
        vungChuaChinh.add(oHienThi, BorderLayout.NORTH);
        vungChuaChinh.add(vungChuaNut, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 200);
        setVisible(true);
    }

    void themCacNut(JPanel vungChuaNut) {
        XuLyNut bamNut = new XuLyNut();

        for (int i = 1; i <= 9; i++) {
            mangNutSo[i] = new JButton("" + i);
            vungChuaNut.add(mangNutSo[i]);
            mangNutSo[i].addActionListener(bamNut);
        }

        nutXoa = new JButton("DEL");
        vungChuaNut.add(nutXoa);
        nutXoa.addActionListener(bamNut);

        mangNutSo[0] = new JButton("0");
        vungChuaNut.add(mangNutSo[0]);
        mangNutSo[0].addActionListener(bamNut);

        nutDatLai = new JButton("C");
        vungChuaNut.add(nutDatLai);
        nutDatLai.addActionListener(bamNut);
    }

    private class XuLyNut implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nhanGiaTri = e.getActionCommand();

            if (nhanGiaTri.charAt(0) >= '0' && nhanGiaTri.charAt(0) <= '9') {
                oHienThi.setText(oHienThi.getText() + nhanGiaTri);
            } else if (nhanGiaTri.equals("DEL")) {
                String chuoiHienTai = oHienThi.getText();
                if (chuoiHienTai.length() > 0) {
                    oHienThi.setText(chuoiHienTai.substring(0, chuoiHienTai.length() - 1));
                }
            } else {
                oHienThi.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new NumberGrid();
    }
}