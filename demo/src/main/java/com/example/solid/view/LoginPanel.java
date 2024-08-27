package com.example.solid.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel {
 private JTextField matriculaField;
    private JPasswordField passwordField;
    private MainFrame mainFrame;
    private LoginController loginController;

    public LoginPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.loginController = new LoginController();

        setLayout(new GridLayout(3, 2));

        add(new JLabel("Matrícula:"));
        matriculaField = new JTextField();
        add(matriculaField);

        add(new JLabel("Senha:"));
        passwordField = new JPasswordField();
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
        add(loginButton);
    }

    private void handleLogin() {
        String matricula = matriculaField.getText();
        String password = new String(passwordField.getPassword());

        boolean isLoggedIn = loginController.login(matricula, password);
        if (isLoggedIn) {
            // Verificar se o usuário é um estudante ou professor
            if (loginController.isUserStudent()) {
                mainFrame.showPanel(new StudentPanel());
            } else if (loginController.isUserTeacher()) {
                mainFrame.showPanel(new TeacherPanel());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Matrícula ou senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
}
