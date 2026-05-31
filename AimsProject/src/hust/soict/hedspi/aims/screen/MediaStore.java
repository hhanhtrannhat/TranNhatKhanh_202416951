package hust.soict.hedspi.aims.screen;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Nút Thêm vào giỏ hàng
        JButton addToCartBtn = new JButton("Add to cart");
        addToCartBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hiển thị thông báo khi thêm vào giỏ
                JOptionPane.showMessageDialog(null,
                        media.getTitle() + " has been added to the cart!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        container.add(addToCartBtn);

        // Nút Play (Chỉ xuất hiện nếu Media implements Playable)
        if (media instanceof Playable) {
            JButton playBtn = new JButton("Play");
            playBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Hiển thị Dialog đang phát Media
                    JOptionPane.showMessageDialog(null,
                            "Playing: " + media.getTitle(),
                            "Media Player",
                            JOptionPane.PLAIN_MESSAGE);
                }
            });
            container.add(playBtn);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}