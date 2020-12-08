package proxy.virtualProxy;

import java.awt.*;
import java.net.URL;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public class ImageProxy implements Icon {
    private ImageIcon imageIcon;
    private URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null) {
            return imageIcon.getIconHeight();
        }
        return 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        System.out.println("in proxy paint icon");
        if(imageIcon != null) {
            System.out.println("imageIcon != null");
            imageIcon.paintIcon(c, g, x, y);
            return;
        }
        g.drawString("Loading image, please wait...", x+300, y+200);
        System.out.println("Loading image, please wait...");
        if(!retrieving) {
            retrieving = true;
            retrievalThread = new Thread(() -> {
                try {
                    imageIcon = new ImageIcon(imageURL, "image");
                    c.repaint();
                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("exit retrievalThread");
            });
            retrievalThread.start();
        }
    }
}
