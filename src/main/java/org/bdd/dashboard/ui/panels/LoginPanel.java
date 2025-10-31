package org.bdd.dashboard.ui.panels;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private final JTextField userField = new JTextField(24);
    private final JPasswordField passField = new JPasswordField(24);

    public LoginPanel() {
        setLayout(new GridBagLayout());
        JPanel form = new JPanel(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(24,24,24,24));

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(8,8,8,8);

        JLabel title = new JLabel("Login", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        form.add(wrap(title), c);

        // Form
        c.gridy++;
        form.add(wrap(labeled("Usuario", userField)), c);
        c.gridy++;
        form.add(wrap(labeled("Contraseña", passField)), c);

        add(form);
    }

    private static JPanel wrap(JComponent c) {
        JPanel p = new JPanel(new BorderLayout());
        p.add(c, BorderLayout.CENTER);
        return p;
    }

    private static JPanel labeled(String label, JComponent field) {
        JPanel p = new JPanel(new BorderLayout(8, 4));
        JLabel l = new JLabel(label);
        p.add(l, BorderLayout.NORTH);
        p.add(field, BorderLayout.CENTER);
        return p;
    }
}
