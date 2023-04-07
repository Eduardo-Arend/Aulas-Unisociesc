package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploSwing extends JFrame implements ActionListener {
    private JButton button;

    public ExemploSwing() {
        super("Exemplo Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());
        button = new JButton("Clique aqui!");
        button.addActionListener(this);
        add(button);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "O botão foi clicado!");
    }

    public static void main(String[] args) {
        new ExemploSwing();
    }
}
