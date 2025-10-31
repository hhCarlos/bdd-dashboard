package org.bdd.dashboard.ui;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class AppFrame extends JFrame {
    private final CardLayout cards = new CardLayout();
    private final JPanel root = new JPanel(cards);
    private final Map<String, JPanel> views = new HashMap<>();

    public AppFrame() {
        super("BDD Dashboard");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setContentPane(root);
    }

    public void register(String key, JPanel panel) {
        views.put(key, panel);
        root.add(panel, key);
    }

    public void showView(String key) {
        cards.show(root, key);
    }
}
