package org.bdd.dashboard;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Asegura que la UI se ejecute en el hilo correcto
        SwingUtilities.invokeLater(() -> {
            // Ventana principal
            JFrame frame = new JFrame("BDD Dashboard");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 700);
            frame.setLocationRelativeTo(null); // Centrar en pantalla

            // Panel principal
            JPanel panel = new JPanel(new BorderLayout());
            JLabel label = new JLabel("🔥 Bienvenido al BDD Dashboard!", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 20));

            // Barra superior (ejemplo)
            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("Archivo");
            JMenuItem exitItem = new JMenuItem("Salir");
            exitItem.addActionListener(e -> System.exit(0));
            fileMenu.add(exitItem);
            menuBar.add(fileMenu);
            frame.setJMenuBar(menuBar);

            // Agrega elementos
            panel.add(label, BorderLayout.CENTER);
            frame.add(panel);

            // Mostrar ventana
            frame.setVisible(true);
        });
    }
}
