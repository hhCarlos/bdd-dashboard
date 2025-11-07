package org.bdd.dashboard.ui.modules.auth;

import org.bdd.dashboard.ui.AppFrame;
import org.bdd.dashboard.ui.View;

import javax.swing.*;
import java.awt.*;

import static org.bdd.dashboard.ui.modules.auth.AuthText.*;

public class Register extends AuthFormBase {
    private JTextField name = new JTextField(24);
    private JTextField lastName = new JTextField(24);
    private JTextField email = new JTextField(24);
    private JPasswordField password = new JPasswordField(24);
    private JPasswordField confirmPassword = new JPasswordField(24);

    public Register(AppFrame app) {
        super(app, TITLE_REGISTER);

        // Form Fileds
        addField(FIELD_NAME, name);
        addField(FIELD_LAST_NAME, lastName);
        addField(FIELD_EMAIL, email);
        addField(FIELD_PASSWORD, password);
        addField(FIELD_CONFIRM_PASSWORD, confirmPassword);

        // Links
        JPanel links = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 0));
        links.add(createLink(TITLE_LOGIN, () -> app.showView(View.LOGIN)));
        links.add(new JLabel("|"));
        links.add(createLink(TITLE_FORGOT_PASSWORD, () -> app.showView(View.LOGIN)));
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
            System.out.println("Name: " + name.getText());
            System.out.println("Lastname: " + lastName.getText());
            System.out.println("Email: " + email.getText());
        });

        btnClean.addActionListener(e -> {
            name.setText("");
            lastName.setText("");
            email.setText("");
            password.setText("");
            confirmPassword.setText("");
        });
    }
}
