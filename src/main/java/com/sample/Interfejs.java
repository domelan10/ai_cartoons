package com.sample;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Interfejs {

    public static String zapytaj(String trescPytania, List<String> warianty) {
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel(trescPytania));

        ButtonGroup group = new ButtonGroup();
        JRadioButton[] buttons = new JRadioButton[warianty.size()];
        
        for (int i = 0; i < warianty.size(); i++) {
            buttons[i] = new JRadioButton(warianty.get(i));
            if (i == 0) buttons[i].setSelected(true);
            group.add(buttons[i]);
            panel.add(buttons[i]);
        }

        int result = JOptionPane.showConfirmDialog(null, panel, "Pytanie", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            for (JRadioButton btn : buttons) {
                if (btn.isSelected()) {
                    return btn.getText();
                }
            }
        }
        return "Zakoncz program";
    }

    public static void polec(String polecane) {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Polecany tytu³: " + polecane));
        JOptionPane.showMessageDialog(null, panel, "Wynik", JOptionPane.INFORMATION_MESSAGE);
    }
}