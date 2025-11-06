package org.bdd.dashboard.ui;

import org.bdd.dashboard.ui.modules.auth.Login;
import org.bdd.dashboard.ui.modules.auth.Register;

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

        // Registrar vistas
        register("login", new Login(this));
        register("register", new Register(this));
    }

    public void register(String key, JPanel panel) {
        views.put(key, panel);
        root.add(panel, key);
    }

    public void showView(String key) {
        cards.show(root, key);
    }
}
