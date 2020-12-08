package proxy.virtualProxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        try {
            URL imageURL = new URL("https://pic.cnblogs.com/face/1554401/20181204164634.png");
            Icon icon = new ImageProxy(imageURL);
            JFrame jFrame = new JFrame();
            jFrame.setSize(1000, 800);
            JPanel backPanel = new JPanel();
            jFrame.add(backPanel);
            JLabel jLabel = new JLabel();
            jLabel.setText("pic h: " + icon.getIconHeight() + ", w: " + icon.getIconWidth());
            backPanel.add(jLabel);
            JPanel jPanel = new JPanel();
            backPanel.add(jPanel);

            JButton button = new JButton("show image");
            button.setSize(100, 200);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    icon.paintIcon(jPanel, jPanel.getGraphics(), 0, 0);
                    jLabel.setText("pic h: " + icon.getIconHeight() + ", w: " + icon.getIconWidth());
                    jLabel.repaint();
                }
            });
            backPanel.add(button);
            jFrame.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
