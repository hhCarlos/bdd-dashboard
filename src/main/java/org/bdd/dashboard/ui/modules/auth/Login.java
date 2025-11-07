package org.bdd.dashboard.ui.modules.auth;

import org.bdd.dashboard.ui.AppFrame;
import org.bdd.dashboard.ui.View;

import javax.swing.*;
import java.awt.*;

import static org.bdd.dashboard.ui.modules.auth.AuthText.*;

public class Login extends AuthFormBase {
    private JTextField user = new JTextField(24);
    private JPasswordField password = new JPasswordField(24);

    public Login(AppFrame app) {
        super(app, TITLE_LOGIN);

        // Form fields
        addField(FIELD_NAME, user);
        addField(FIELD_PASSWORD, password);

        // Links
        JPanel links = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 0));
        links.add(createLink(TITLE_REGISTER, () -> app.showView(View.REGISTER)));
        links.add(new JLabel("|"));
        links.add(createLink(TITLE_FORGOT_PASSWORD, () -> app.showView(View.REGISTER)));
        addSection(links);

        // Buttons
        JButton btnRegister = new JButton(BUTTON_ACCEPT);
        JButton btnClean = new JButton(BUTTON_CLEAN);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 0));
        buttons.add(btnRegister);
        buttons.add(btnClean);
        addSection(buttons);

        // Actions
        btnRegister.addActionListener(e -> {
            System.out.println("Name: " + user.getText());
            System.out.println("Lastname: " + password.getText());
        });

        btnClean.addActionListener(e -> {
            user.setText("");
            password.setText("");
        });
    }
}
