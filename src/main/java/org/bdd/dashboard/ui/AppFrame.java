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
        register(View.LOGIN, new Login(this));
        register(View.REGISTER, new Register(this));

        // show login by default
        showView(View.LOGIN);
    }

    public void register(View view, JPanel panel) {
        views.put(view.name(), panel);
        root.add(panel, view.key());
    }

    public void showView(View view) {
        cards.show(root, view.key());
    }
}
