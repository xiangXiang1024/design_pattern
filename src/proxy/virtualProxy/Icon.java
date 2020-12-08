package proxy.virtualProxy;

import java.awt.*;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public interface Icon {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(final Component c, Graphics g, int x, int y);
}
