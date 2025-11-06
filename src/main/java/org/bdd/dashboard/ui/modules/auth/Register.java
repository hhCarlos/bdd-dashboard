package org.bdd.dashboard.ui.modules.auth;

import org.bdd.dashboard.ui.AppFrame;
import static org.bdd.dashboard.ui.components.UIUtils.*;

import javax.swing.*;
import java.awt.*;


public class Register extends JPanel {
    private JLabel linkLogin = link("Login");

    public Register(AppFrame app) {
        setLayout(new GridBagLayout());
        JPanel form = new JPanel(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(24,24,24,24));

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(8,8,8,8);

        JLabel title = new JLabel("Registro de usuario", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        form.add(wrap(title), c);

        add(form);

        JPanel links = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 0));
        links.add(linkLogin);
        links.add(new JLabel("|"));
        links.add(linkLogin);
        c.gridy++;

        add(wrap(links), c);

        // Acciones de los links
        linkLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Click en login.");
                app.showView("login");
            }
        });
    }
}
