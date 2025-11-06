package org.bdd.dashboard.ui.modules.auth;

import org.bdd.dashboard.ui.AppFrame;

import javax.swing.*;
import java.awt.*;

import static org.bdd.dashboard.ui.components.UIUtils.*;

public class Login extends JPanel {
    private final JTextField userField = new JTextField(24);
    private final JPasswordField passField = new JPasswordField(24);
    private final JLabel linkRegister = link("Registrate");
    private final JLabel linkForgotPassword = link("Olvidé mi contraseña");
    private final JButton btnLogin = new JButton("Aceptar");
    private final JButton btnClear = new JButton("Limpiar");

    public Login(AppFrame app) {
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

        // links
        JPanel links = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 0));
        links.add(linkRegister);
        links.add(new JLabel("|"));
        links.add(linkForgotPassword);
        c.gridy++;

        add(wrap(links), c);

        // buttons
        JPanel actions = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 0));
        actions.add(btnLogin);
        actions.add(btnClear);
        c.gridy++;

        add(wrap(actions), c);

        // Acciones de login y limpiar
        btnLogin.addActionListener(e -> {
            System.out.println("Boton de aceptar presionado");
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            System.out.println("Usuario: " + user + " | Contraseña: " + pass);
        });

        btnClear.addActionListener(e -> {
            System.out.println("Boton de limpiar presionado");
            userField.setText("");
            passField.setText("");
        });

        // Acciones de los enlaces Registrate y Olvide Password
        linkRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Click en registrate.");
                app.showView("register");
            }
        });

        linkForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Click en Olvide password.");
            }
        });
    }
}
