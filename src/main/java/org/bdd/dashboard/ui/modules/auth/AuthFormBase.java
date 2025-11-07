package org.bdd.dashboard.ui.modules.auth;

import org.bdd.dashboard.ui.AppFrame;

import javax.swing.*;
import java.awt.*;

import static org.bdd.dashboard.ui.components.UIUtils.*;

public class AuthFormBase extends JPanel {
    protected final AppFrame app;
    protected final JPanel form = new JPanel(new GridBagLayout());
    protected final GridBagConstraints c = new GridBagConstraints();

    public AuthFormBase(AppFrame app, String titleText) {
        this.app = app;
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(24,24,24, 24));

        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(8,8,8,8);

        JLabel title = new JLabel(titleText, SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        form.add(wrap(title), c);

        add(form);
    }

    protected void addField(String label, JComponent field) {
        c.gridy++;
        form.add(labeled(label, field), c);
    }

    protected void addSection(JPanel section) {
        c.gridy++;
        add(wrap(section), c);
    }

    protected JLabel createLink(String text, Runnable onClick) {
        JLabel link = link(text);
        link.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                onClick.run();
            }
        });

        return link;
    }
}
