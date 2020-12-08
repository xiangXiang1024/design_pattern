package proxy.virtualProxy;

import java.awt.*;
import java.net.URL;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public class ImageIcon implements Icon {
    public ImageIcon(URL imageURL, String image) {
    }

    @Override
    public int getIconWidth() {
        return 1200;
    }

    @Override
    public int getIconHeight() {
        return 1000;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // TODO download image
    }
}
