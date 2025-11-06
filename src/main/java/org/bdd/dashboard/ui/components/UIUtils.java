package org.bdd.dashboard.ui.components;

import javax.swing.*;
import java.awt.*;

public class UIUtils {

    private UIUtils() {}

    public static JPanel wrap(JComponent c) {
        JPanel p = new JPanel(new BorderLayout());
        p.add(c, BorderLayout.CENTER);
        return p;
    }

    public static JPanel labeled(String label, JComponent field) {
        JPanel p = new JPanel(new BorderLayout(8, 4));
        JLabel l = new JLabel(label);
        p.add(l, BorderLayout.NORTH);
        p.add(field, BorderLayout.CENTER);
        return p;
    }

    public static JLabel link(String text) {
        JLabel l = new JLabel("<html><u>" + text + "</u></html>");
        l.setForeground(new Color(0x1B73E8));
        l.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return l;
    }
}
