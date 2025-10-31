package org.bdd.dashboard;

import org.bdd.dashboard.ui.AppFrame;
import org.bdd.dashboard.ui.panels.LoginPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AppFrame app = new AppFrame();

            app.register("login", new LoginPanel());

            app.showView("login");
            app.setVisible(true);
        });
    }
}
