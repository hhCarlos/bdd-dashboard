package org.bdd.dashboard;

import org.bdd.dashboard.ui.AppFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AppFrame app = new AppFrame();
            app.setVisible(true);
        });
    }
}
