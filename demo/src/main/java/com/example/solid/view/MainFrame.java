package com.example.solid.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
    public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Sistema de Gerenciamento Escolar");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        LoginPanel loginPanel = new LoginPanel(this);
        add(loginPanel, BorderLayout.CENTER);
    }

    public void showPanel(JPanel panel) {
        getContentPane().removeAll();
        add(panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}

