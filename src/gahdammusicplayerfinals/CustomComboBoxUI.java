package gahdammusicplayerfinals;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

public class CustomComboBoxUI extends BasicComboBoxUI {
    private Color backgroundColor = new Color(34, 34, 34);
    private Color foregroundColor = new Color(220, 220, 220);
    private Color hoverColor = new Color(45, 45, 45);
    private Color selectedColor = new Color(67, 67, 67);
    private Color arrowButtonColor = new Color(125, 125, 125);

    @Override
    protected JButton createArrowButton() {
        return new JButton() {
            @Override
            public int getWidth() {
                return 0;
            }

            @Override
            public void paint(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(arrowButtonColor);
                g2.fillRect(0, 0, getWidth(), getHeight());
                g2.dispose();
            }
        };
    }

    @Override
    protected ComboPopup createPopup() {
        BasicComboPopup popup = (BasicComboPopup) super.createPopup();
        popup.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        popup.getList().setBackground(backgroundColor);
        popup.getList().setSelectionBackground(selectedColor);
        return popup;
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        JComboBox<?> comboBox = (JComboBox<?>) c;
        comboBox.setEditable(true);
        comboBox.setForeground(foregroundColor);
        comboBox.setBackground(backgroundColor);
        comboBox.setOpaque(true); // Ensure the component background is painted
        comboBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                comboBox.getEditor().getEditorComponent().setBackground(hoverColor);
            }

            @Override
            public void focusLost(FocusEvent e) {
                comboBox.getEditor().getEditorComponent().setBackground(backgroundColor);
            }
        });
    }

    @Override
    protected ListCellRenderer<Object> createRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                renderer.setForeground(foregroundColor);
                renderer.setBackground(backgroundColor);
                return renderer;
            }
        };
    }
}

